package com.example.demo.buoi4.Repository;

import com.example.demo.buoi4.model.GiangVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class GiangVienResporistory implements IGiangVienStory {
    private final static ArrayList<GiangVien> dsGV = new ArrayList<>();


    static {

        dsGV.add(new GiangVien("23", "HUY", 2006));
        dsGV.add(new GiangVien("232", "HUY", 2006));
        dsGV.add(new GiangVien("22", "HUY", 2006));
        dsGV.add(new GiangVien("23", "HUY", 2006));
        dsGV.add(new GiangVien("233", "HUY", 2006));
    }

    @Override
    public ArrayList<GiangVien> getALL() {
        return dsGV;
    }
}
