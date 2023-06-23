package com.example.demo.LuyenTap;

import java.util.Arrays;
import java.util.List;

public class SinhVien {

    private Long id;
    private String TenSinhVien;

    private Integer tuoi;

    private Integer gioiTinh;

    private String[] hobby;

    public SinhVien() {
    }


    public Long getId() {
        return id;
    }

    public String getTenSinhVien() {
        return TenSinhVien;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTenSinhVien(String tenSinhVien) {
        TenSinhVien = tenSinhVien;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public SinhVien(Long id, String tenSinhVien, Integer tuoi, Integer gioiTinh, String[] hobby) {
        this.id = id;
        TenSinhVien = tenSinhVien;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.hobby = hobby;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
