package com.example.demo.b5.model;

public class GiangVien {

    private String maGiangVien;
    private String tenGiangVien;
    private Integer namSinh;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, String tenGiangVien, Integer namSinh) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.namSinh = namSinh;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
}
