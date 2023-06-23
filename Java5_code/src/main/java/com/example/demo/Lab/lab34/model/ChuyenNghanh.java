package com.example.demo.Lab.lab34.model;

public class ChuyenNghanh {
    private String id;

    private String tenCN;

    public ChuyenNghanh() {
    }

    public ChuyenNghanh(String id, String tenCN) {
        this.id = id;
        this.tenCN = tenCN;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }
}
