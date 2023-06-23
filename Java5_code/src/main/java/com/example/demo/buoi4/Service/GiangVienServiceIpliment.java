package com.example.demo.buoi4.Service;

import com.example.demo.buoi4.Repository.GiangVienResporistory;
import com.example.demo.buoi4.Repository.IGiangVienStory;
import com.example.demo.buoi4.model.GiangVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class GiangVienServiceIpliment implements IGiangVienService{

    @Autowired
    private IGiangVienStory giangVienStory;
    @Override
    public ArrayList<GiangVien> getAll() {
        return giangVienStory.getALL();
    }
}
