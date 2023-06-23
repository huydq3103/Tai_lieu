package com.example.demo.lab34.model;

public class MonHoc {

    private Integer maMon;
    private String tenMon;

    private Integer SoTinChi;

    private ChuyenNghanh cn;

    private String[] giangVien;

    private String batBuoc;

    public MonHoc() {
    }

    public MonHoc(Integer maMon, String tenMon, Integer soTinChi, ChuyenNghanh cn, String[] giangVien, String batBuoc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        SoTinChi = soTinChi;
        this.cn = cn;
        this.giangVien = giangVien;
        this.batBuoc = batBuoc;
    }

    public Integer getMaMon() {
        return maMon;
    }

    public void setMaMon(Integer maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public Integer getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(Integer soTinChi) {
        SoTinChi = soTinChi;
    }

    public ChuyenNghanh getCn() {
        return cn;
    }

    public void setCn(ChuyenNghanh cn) {
        this.cn = cn;
    }

    public String[] getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String[] giangVien) {
        this.giangVien = giangVien;
    }

    public String getBatBuoc() {
        return batBuoc;
    }

    public void setBatBuoc(String batBuoc) {
        this.batBuoc = batBuoc;
    }

    public String batBUoc(){
         if(Integer.valueOf(batBuoc)==0){
               return "khong";
         }else if(Integer.valueOf(batBuoc)==1){
              return "co";
         }
         return null;
    }
}
