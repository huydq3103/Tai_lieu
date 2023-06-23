package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("GiangVienFileRepository")
public class GiangVienFileRepository implements IGiangVienRepository {

    private static final ArrayList<GiangVien> DANH_SACH_GIANG_VIEN = new ArrayList<>();
    static {
        DANH_SACH_GIANG_VIEN.add(new GiangVien("NguyenVV4", "Đặng Quang Minh", 2005));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("HangNT169", "Nguyễn Anh Dũng", 2004));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("PhongTT35", "Nguyễn Hoàng Tiến", 2003));
    }

    @Override
    public ArrayList<GiangVien> getAll() {
        return DANH_SACH_GIANG_VIEN;
    }
}
