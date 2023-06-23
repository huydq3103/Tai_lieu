package com.example.demo.lab78.Responsitory;

import com.example.demo.lab78.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface sinhvIenSeRespon extends JpaRepository<SinhVien, Integer> {
    SinhVien  findByMa(Integer ma);

    Page<SinhVien> findByTen(String ten,Pageable pageable);


    @Query("""
                    select sv from SinhVien sv order by sv.chuyenNganh desc 
            """)
    Page<SinhVien> findAllPanable(Pageable pageable);

    @Query("""
                    select sv from SinhVien sv where sv.chuyenNganh =?1
            """)
    List<SinhVien> findByChuyenNganh(String chuyenNganh);
}
