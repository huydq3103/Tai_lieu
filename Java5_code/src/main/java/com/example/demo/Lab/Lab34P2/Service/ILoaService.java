package com.example.demo.Lab.Lab34P2.Service;

import com.example.demo.Lab.Lab34P2.Model.Loa;

import java.util.List;

public interface ILoaService {

    public void xoa(Integer MaLoa);

    public void them(Loa loa);

    public List<Loa> getALl();

    public Loa details(Integer MaLoa);

    public void update(Loa loa, Integer ma);
}
