package com.example.demo.buoi3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class GioHangService {
    private final GioHang gioHang = new GioHang();

    public void themSanPham(Long id, Integer soLuong) {

        Map<Long, Integer> dsSanPHam = gioHang.getDanhSachSanPham();

        if (dsSanPHam.containsKey(id)) {
            //buoc 1 lay so luong san pham
            Integer slHienTai = dsSanPHam.get(id);
            // buoc 2 cong don
            Integer slMoi = slHienTai + soLuong;
            // cap nhat lai danh sach
            dsSanPHam.put(id, slMoi);

        } else {
            // newu chua ton tai thi them moi
            dsSanPHam.put(id, soLuong);
        }
    }

    ;

    public void themGia(Long id, BigDecimal gia) {
        Map<Long, BigDecimal> giaSP = gioHang.getGiaSP();
        if (giaSP.containsKey(id)) {

        } else {
            giaSP.put(id, gia);

        }

    }

    public BigDecimal tinhTongTien(){
        Map<Long, BigDecimal> giaSP = gioHang.getGiaSP();
        Map<Long, Integer> dsSanPHam = gioHang.getDanhSachSanPham();
        // Tính tổng số tiền
        BigDecimal totalAmount = dsSanPHam.entrySet().stream()
                .map(product -> {
                    Long productId = product.getKey();
                    Integer quantity = product.getValue();
                    BigDecimal price = (giaSP.get(productId)); // Lấy giá sản phẩm từ map dsGiaSanPham
                    if (price != null) {
                        return price.multiply(BigDecimal.valueOf(quantity));
                    }
                    return BigDecimal.ZERO;
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // In ra tổng số tiền
        return totalAmount;
    }

    public Map<Long, Integer> xemSanPham() {
        return gioHang.getDanhSachSanPham();
    }


}
