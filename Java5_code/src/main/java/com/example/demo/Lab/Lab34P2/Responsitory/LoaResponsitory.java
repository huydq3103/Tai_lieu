package com.example.demo.Lab.Lab34P2.Responsitory;

import com.example.demo.Lab.Lab34P2.Model.Loa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("LoaResponsitory")
public class LoaResponsitory implements ILoaResponsitory {

    private final static List<Loa> list = new ArrayList<>();

    static {

        list.add(new Loa(1,"JBl",100F,"red","100hz"));
        list.add(new Loa(2,"JBl2",100F,"yellow","100hz"));
        list.add(new Loa(3,"JBl4",100F,"red","100hz"));
        list.add(new Loa(4,"JBl4",100F,"red","100hz"));
        list.add(new Loa(5,"JBl5",100F,"blue","100hz"));
    }

    @Override
    public List<Loa> getALl() {
        return list;
    }
}
