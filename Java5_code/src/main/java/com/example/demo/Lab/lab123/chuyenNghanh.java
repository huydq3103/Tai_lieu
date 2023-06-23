package com.example.demo.Lab.lab123;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class chuyenNghanh {


    private String ma;
    @NotBlank(message = "ten khong duoc de trong")
    private String ten;
    @NotBlank(message = "he dao tao khong duoc de trong")
    private String heDaoTao;
    @NotNull(message = "so ki khong duoc de trong")
    private Integer soKi;
    @NotBlank(message = "danh sach mon khong duoc de trong")
    private String danhSachMon;

    public chuyenNghanh() {
    }

    public chuyenNghanh(String ma, String ten, String heDaoTao, Integer soKi, String danhSachMon) {
        this.ma = ma;
        this.ten = ten;
        this.heDaoTao = heDaoTao;
        this.soKi = soKi;
        this.danhSachMon = danhSachMon;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHeDaoTao() {
        return heDaoTao;
    }

    public Integer getSoKi() {
        return soKi;
    }

    public String getDanhSachMon() {
        return danhSachMon;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHeDaoTao(String heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    public void setSoKi(Integer soKi) {
        this.soKi = soKi;
    }

    public void setDanhSachMon(String danhSachMon) {
        this.danhSachMon = danhSachMon;
    }
}
