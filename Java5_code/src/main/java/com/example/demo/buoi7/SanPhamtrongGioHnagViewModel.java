package com.example.demo.buoi7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamtrongGioHnagViewModel {


      private Integer maSanpHam;

      private String tenSanPHam;

      private BigDecimal donGia;

      private Integer soLuong;

      private BigDecimal thanhTien;

      public BigDecimal getThanhTien(){
            return  donGia.multiply(BigDecimal.valueOf(soLuong));
      }
}
