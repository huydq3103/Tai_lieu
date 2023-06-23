package com.example.demo.Lab.Lab34P2.Service;

import com.example.demo.Lab.Lab34P2.Model.Loa;
import com.example.demo.Lab.Lab34P2.Responsitory.ILoaResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoaService implements ILoaService{

    @Autowired
    @Qualifier("LoaResponsitory")
    private ILoaResponsitory responsitory;

    List<Loa> list ;

    @Override
    public void xoa(Integer MaLoa) {
        for (Loa l: list) {
            if(l.getMaLoa().equals(MaLoa)){
                list.remove(l);
                break;
            }
        }
    }

    @Override
    public void them(Loa loa) {
         list.add(loa);
    }

    @Override
    public List<Loa> getALl() {
        if (list == null) {
            list = responsitory.getALl();
        }
        return list;
    }

    @Override
    public Loa details(Integer MaLoa) {
        for (Loa l: list) {
            if(l.getMaLoa().equals(MaLoa)){
                return l;
            }
        }
        return null;
    }

    @Override
    public void update(Loa loa, Integer ma) {
        for (Loa loa1 : list) {
            if (loa1.getMaLoa().equals(ma)) {
                loa1.setTenLoa(loa.getTenLoa());
                loa1.setCongXuat(loa.getCongXuat());
                loa1.setKenhAmThanh(loa.getKenhAmThanh());
                loa1.setMauSac(loa.getMauSac());
            }
        }
    }
}
