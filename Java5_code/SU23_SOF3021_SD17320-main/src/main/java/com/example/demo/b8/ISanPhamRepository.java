package com.example.demo.b8;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISanPhamRepository extends JpaRepository<SanPham, Integer> {

    Page<SanPham> findByTenSanPhamContains(String ten, Pageable pageable);
}
