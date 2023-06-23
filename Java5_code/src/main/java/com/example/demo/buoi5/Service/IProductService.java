package com.example.demo.buoi5.Service;

import com.example.demo.buoi5.Model.Product;
import com.example.demo.buoi5.Model.ProductNameAndPrice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> getALL();

    public void xoa(Integer id);

    public void save(Product product);

    public Optional<ProductNameAndPrice> getIdAndPrice(Integer id);
    public Optional<Product> getById(Integer id);

    public List<Product> find(String keyword);

    public Page<Product> PagePagination(Optional<Integer> pageNo);
}
