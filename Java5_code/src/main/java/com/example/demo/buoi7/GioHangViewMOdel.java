package com.example.demo.buoi7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioHangViewMOdel {


    private List<SanPhamtrongGioHnagViewModel> sanpham;

    private BigDecimal tongTien;

}
