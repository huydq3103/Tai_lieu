package com.example.demo.buoi5.Service;

import com.example.demo.buoi5.Model.Product;
import com.example.demo.buoi5.Model.ProductNameAndPrice;
import com.example.demo.buoi5.Responsitory.IProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceIplm implements IProductService {

    @Autowired
    private IProductResponsitory responsitory;

    List<Product> list;

    @Override
    public List<Product> getALL() {
        list = responsitory.findAll();
        return list;
    }

    @Override
    public void xoa(Integer id) {
        responsitory.deleteById(id);
    }

    @Override
    public void save(Product product) {
        responsitory.save(product);
    }

    @Override
    public Optional<ProductNameAndPrice> getIdAndPrice(Integer id) {

      return responsitory.findByProductId(id);
    }

    @Override
    public Optional<Product> getById(Integer id) {
        return responsitory.findById(id);
    }

    @Override
    public List<Product> find(String keyword) {
        return responsitory.findByProductNameLike("%"+keyword+"%");
    }

    @Override
    public Page<Product> PagePagination(Optional<Integer> pageNo) {
          Pageable pageable = PageRequest.of(pageNo.orElse(0), 100);
          return  responsitory.findAll(pageable);

    }


}
