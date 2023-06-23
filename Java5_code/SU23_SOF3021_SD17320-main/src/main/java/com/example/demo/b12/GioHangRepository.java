package com.example.demo.b12;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Map;

@Repository
@SessionScope
public class GioHangRepository {

    private GioHangDomainModel gioHang = new GioHangDomainModel();

    public void themSanPhamVaoGio(Integer maSanPham, Integer soLuong) {
        Map<Integer, Integer> sanPhamTrongGio = gioHang.getDanhSachSanPham();
        sanPhamTrongGio.put(maSanPham, soLuong);
    }

    public void suaSoLuongSanPhamTrongGio(Integer maSanPham, Integer soLuongCapNhap) {
        Map<Integer, Integer> sanPhamTrongGio = gioHang.getDanhSachSanPham();
        sanPhamTrongGio.put(maSanPham, soLuongCapNhap);
    }

    public Integer laySoLuongSanPhamTrongGio(Integer maSanPham) {
        return gioHang.getDanhSachSanPham().get(maSanPham);
    }

    public boolean sanPhamDaCoTrongGio(Integer maSanPham) {
        return gioHang.getDanhSachSanPham().containsKey(maSanPham);
    }

    public GioHangDomainModel layGioHang() {
        return gioHang;
    }
}
