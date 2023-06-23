package com.example.demo.Lab.Lab34P2.Model;

public class Loa {

     private Integer MaLoa;

     private String tenLoa;

     private Float CongXuat;

     private String mauSac;

     private String kenhAmThanh;


    public Loa() {
    }

    public Loa(Integer maLoa, String tenLoa, Float congXuat, String mauSac, String kenhAmThanh) {
        MaLoa = maLoa;
        this.tenLoa = tenLoa;
        CongXuat = congXuat;
        this.mauSac = mauSac;
        this.kenhAmThanh = kenhAmThanh;
    }

    public Integer getMaLoa() {
        return MaLoa;
    }

    public void setMaLoa(Integer maLoa) {
        MaLoa = maLoa;
    }

    public String getTenLoa() {
        return tenLoa;
    }

    public void setTenLoa(String tenLoa) {
        this.tenLoa = tenLoa;
    }

    public Float getCongXuat() {
        return CongXuat;
    }

    public void setCongXuat(Float congXuat) {
        CongXuat = congXuat;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKenhAmThanh() {
        return kenhAmThanh;
    }

    public void setKenhAmThanh(String kenhAmThanh) {
        this.kenhAmThanh = kenhAmThanh;
    }
}
