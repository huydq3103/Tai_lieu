package com.example.demo.b5.service;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public interface IGiangVienService {

    ArrayList<GiangVien> getAll();
}
