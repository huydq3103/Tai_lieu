package com.example.demo.b12;

import java.math.BigDecimal;
import java.util.List;

public class GioHangViewModel {

    private List<SanPhamTrongGioViewModel> sanPham;
    private BigDecimal tongTien;

    public List<SanPhamTrongGioViewModel> getSanPham() {
        return sanPham;
    }

    public void setSanPham(List<SanPhamTrongGioViewModel> sanPham) {
        this.sanPham = sanPham;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }
}
