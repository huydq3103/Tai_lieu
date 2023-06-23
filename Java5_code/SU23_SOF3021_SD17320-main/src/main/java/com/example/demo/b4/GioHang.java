package com.example.demo.b4;

import java.util.HashMap;
import java.util.Map;

public class GioHang {

    // Long <-> Mã sản phẩm
    // Integer <-> Số lượng sản phẩm
    private Map<Long, Integer> danhSachSanPham = new HashMap<>();

    public Map<Long, Integer> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(Map<Long, Integer> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
