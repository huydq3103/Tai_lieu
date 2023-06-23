package com.example.demo.buoi4.model;

public class GiangVien {

    private String maGV;
    private String tenGV;
    private Integer namSinh;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, Integer namSinh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.namSinh = namSinh;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
}
