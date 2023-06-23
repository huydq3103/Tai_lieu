package com.example.demo.Lab.lab34.Responsitory;

import com.example.demo.Lab.lab34.model.ChuyenNghanh;
import com.example.demo.Lab.lab34.model.MonHoc;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("MonHocResponsitory")
public class MonHocResponsitory implements IMonHocResponsitory {

    private final static List<MonHoc> list = new ArrayList<>();

    static {
        list.add(new MonHoc(1,"2teo2", 12, new ChuyenNghanh("JAVA", "IT"), new String[]{"ten33", "tien"}, "co"));
        list.add(new MonHoc(2, "iteo", 12, new ChuyenNghanh("JAVA", "IT"), new String[]{"ten3", "tien"}, "co"));
        list.add(new MonHoc(3, "iteo", 12, new ChuyenNghanh("JAVA", "IT"), new String[]{"ten2", "tien"}, "co"));
        list.add(new MonHoc(4, "iteo", 12, new ChuyenNghanh("JAVA", "IT"), new String[]{"ten1", "tien"}, "co"));
    }

    @Override
    public List<MonHoc> getALL() {
        return list;
    }
}
