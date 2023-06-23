package com.example.demo.lab34.Service;

import com.example.demo.lab34.Responsitory.IMonHocResponsitory;
import com.example.demo.lab34.model.MonHoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocserviceIpliment implements IMonHocService{

    @Autowired
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
}
