package com.example.demo.lab78.service;

import com.example.demo.Lab56.DieuHoa;
import com.example.demo.lab78.SinhVien;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface IsinhVienservice {

     Page<SinhVien> getALl(Optional<Integer> pageNo);

//     Page<SinhVien> findByName(String name,Optional<Integer> pageNo);

     Page<SinhVien> findByName(String name, Optional<Integer> pageNo);

     void them(SinhVien sinhVien);

     void sua(SinhVien sinhVien,Integer ma);

     void xoa(Integer ma);

     SinhVien getOne(Integer ma);

     List<SinhVien> getOne2(String chuyenNGhanh);

}
