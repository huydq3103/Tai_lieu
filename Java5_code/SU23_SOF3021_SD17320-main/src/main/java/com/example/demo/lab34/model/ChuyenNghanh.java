package com.example.demo.lab34.model;

public class ChuyenNghanh {
    private Integer id;

    private String tenCN;

    public ChuyenNghanh() {
    }

    public ChuyenNghanh(Integer id, String tenCN) {
        this.id = id;
        this.tenCN = tenCN;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }
}
