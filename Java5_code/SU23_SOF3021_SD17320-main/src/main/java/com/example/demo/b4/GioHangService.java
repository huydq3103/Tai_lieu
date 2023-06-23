package com.example.demo.b4;

import java.util.Map;

public class GioHangService {

    private final GioHang gioHang = new GioHang();

    public void themSanPham(Long sphamId, Integer soLuong) {
        Map<Long, Integer> dsSanPham = gioHang.getDanhSachSanPham();
        // Nếu trong giỏ đã có hàng
        if (dsSanPham.containsKey(sphamId)) { // thì tăng số lượng
            // B1. Lấy số lượng hiện tại
            Integer soLuongHienTai = dsSanPham.get(sphamId);
            // B2. Cộng dồn
            Integer soLuongMoi = soLuongHienTai + soLuong;
            // B3. Cập nhập lại danh sách
            dsSanPham.put(sphamId, soLuongMoi);
        } else { // Nếu chưa tồn tại thì thêm mới
            dsSanPham.put(sphamId, soLuong);
        }
    }

    public Map<Long, Integer> xemSanPham() {
        return gioHang.getDanhSachSanPham();
    }
}
