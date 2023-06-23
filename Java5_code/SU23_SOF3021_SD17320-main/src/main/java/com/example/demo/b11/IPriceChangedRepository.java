package com.example.demo.b11;

import com.example.demo.b7.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPriceChangedRepository extends JpaRepository<Product, Integer> {

//    @Query("""
//        SELECT od.PurchasedMoney, o.CreatedDate
//        	FROM OrderDetail od
//        		LEFT JOIN [Order] o ON o.OrderId = od.OrderId
//        	WHERE od.ProductId = :maSanPham
//        	ORDER BY o.CreatedDate
//    """)
//    List<PriceChanged> getPriceChangedOfProduct(@Param("maSanPham") Integer productId);
}
