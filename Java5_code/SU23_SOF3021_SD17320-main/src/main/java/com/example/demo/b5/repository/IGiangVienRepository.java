package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public interface IGiangVienRepository {

    ArrayList<GiangVien> getAll();
}
