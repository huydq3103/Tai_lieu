package com.example.demo.Lab.lab34.Service;

import com.example.demo.Lab.lab34.model.MonHoc;
import com.example.demo.Lab.lab34.Responsitory.IMonHocResponsitory;
import com.example.demo.LuyenTap.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocserviceIpliment implements IMonHocService{

    @Autowired
    @Qualifier("MonHocResponsitory")
    private IMonHocResponsitory responsitory;

    List<MonHoc> list ;
    @Override
    public void xoa(Integer ma) {
        for (MonHoc mh: list) {
            if(mh.getMaMon().equals(ma)){
                list.remove(mh);
                break;
            }
        }
    }

    @Override
    public void them(MonHoc monHoc) {
           list.add(monHoc);
    }

    @Override
    public List<MonHoc> getALl() {
        if (list == null) {
            list = responsitory.getALL();
        }
        return list;
    }

    @Override
    public MonHoc details(Integer maMon) {
        for (MonHoc mh : list) {
            if (mh.getMaMon().equals(maMon)) {
                return mh;
            }

        }
        return null ;
    }
    // khong duoc truyen truc tiep list vao truowc khi kiem tra sẽ gây ra lỗi null
}
