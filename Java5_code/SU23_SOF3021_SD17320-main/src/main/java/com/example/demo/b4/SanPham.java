package com.example.demo.b4;

import java.math.BigDecimal;

public class SanPham {

    private Long sanPhamId;
    private String tenSanPham;
    private Integer soLuongTon;
    private BigDecimal giaHienTai;

    public SanPham() {
    }

    public SanPham(Long sanPhamId, String tenSanPham, Integer soLuongTon, BigDecimal giaHienTai) {
        this.sanPhamId = sanPhamId;
        this.tenSanPham = tenSanPham;
        this.soLuongTon = soLuongTon;
        this.giaHienTai = giaHienTai;
    }

    public Long getSanPhamId() {
        return sanPhamId;
    }

    public void setSanPhamId(Long sanPhamId) {
        this.sanPhamId = sanPhamId;
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
