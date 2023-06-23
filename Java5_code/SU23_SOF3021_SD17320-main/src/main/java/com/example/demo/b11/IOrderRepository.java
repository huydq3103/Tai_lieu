package com.example.demo.b11;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderRepository
        extends JpaRepository<Order, Integer> {

    @Query("SELECT o FROM Order o ORDER BY o.createdDate")
    List<Order> timHet();

    @Query("""
        SELECT o FROM Order o 
            WHERE o.customerNumber LIKE :soDienThoai
    """)
    List<Order> timTheoSoDienThoai(@Param("soDienThoai") String sdt);

    @Query("""
        SELECT new com.example.demo.b11.OrderVangLai(o.orderId, o.createdDate) 
            FROM Order o WHERE o.customerNumber IS NULL 
    """)
    List<OrderVangLai> timTheoKhachVangLai();
}
