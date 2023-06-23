package com.example.demo.Lab.lab34.Service;

import com.example.demo.Lab.lab34.model.MonHoc;

import java.util.List;

public interface IMonHocService {

     public void xoa(Integer maMon);

     public void them(MonHoc monHoc);

     public List<MonHoc> getALl();

     public MonHoc details(Integer maMon);
}
