package com.example.demo.b5.service;

import com.example.demo.b5.model.GiangVien;
import com.example.demo.b5.repository.IGiangVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GiangVienService implements IGiangVienService {

    @Autowired
    @Qualifier("GiangVienFileRepository")
    private IGiangVienRepository repository;

    @Override
    public ArrayList<GiangVien> getAll() {
        return repository.getAll();
    }
}
