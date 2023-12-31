package com.example.demo.buoi3;

import java.math.BigDecimal;

public class SanPham {
    private Long SanPhamID;

    private String tenSanPham;

    private Integer soLuongTon;

    private BigDecimal giaHienTai;
    public SanPham() {
    }

    public SanPham(Long sanPhamID, String tenSanPham, Integer soLuongTon, BigDecimal giaHienTai) {
        SanPhamID = sanPhamID;
        this.tenSanPham = tenSanPham;
        this.soLuongTon = soLuongTon;
        this.giaHienTai = giaHienTai;
    }

    public Long getSanPhamID() {
        return SanPhamID;
    }

    public void setSanPhamID(Long sanPhamID) {
        SanPhamID = sanPhamID;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(BigDecimal giaHienTai) {
        this.giaHienTai = giaHienTai;
    }
}
