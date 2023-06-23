package com.example.demo.buoi3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class GioHang {
    private Map<Long,Integer> DanhSachSanPham = new HashMap<>();

    private Map<Long, BigDecimal> giaSP = new HashMap<>();

    public Map<Long, BigDecimal> getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Map<Long, BigDecimal> giaSP) {
        this.giaSP = giaSP;
    }

    public Map<Long, Integer> getDanhSachSanPham() {
        return DanhSachSanPham;
    }

    public void setDanhSachSanPham(Map<Long, Integer> danhSachSanPham) {
        DanhSachSanPham = danhSachSanPham;
    }
}
