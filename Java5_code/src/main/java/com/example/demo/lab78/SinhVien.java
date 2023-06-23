package com.example.demo.lab78;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sinhvien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masv")
    private Integer ma;
    @Column(name = "ten_sv")

    private String ten;
    @Column(name = "so_tin_chi")

    private Integer tinChi;
    @Column(name = "diem_tong_ket")

    private Integer diem;
    @Column(name = "chuyen_nganh")

    private String chuyenNganh;

}
