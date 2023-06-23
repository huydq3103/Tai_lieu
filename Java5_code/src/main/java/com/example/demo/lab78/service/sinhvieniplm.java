package com.example.demo.lab78.service;



import com.example.demo.lab78.Responsitory.sinhvIenSeRespon;
import com.example.demo.lab78.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class sinhvieniplm implements IsinhVienservice {

    @Autowired
    private sinhvIenSeRespon responsitory;


    @Override
    public Page<SinhVien> getALl(Optional<Integer> pageNo) {
        Pageable pageable = PageRequest.of(pageNo.orElse(0), 2);
        return responsitory.findAllPanable(pageable);
    }

    @Override
    public Page<SinhVien> findByName(String name, Optional<Integer> pageNo) {
        Pageable pageable = PageRequest.of(pageNo.orElse(0), 2);
        return responsitory.findByTen(name,pageable);

    }

    @Override
    public void them(SinhVien sinhVien) {
        responsitory.save(sinhVien);
    }

    @Override
    public void sua(SinhVien dieuHoa, Integer ma) {
        responsitory.findById(ma)
                .map(dh -> {
                    dh.setDiem(dieuHoa.getDiem());
                    dh.setTen(dieuHoa.getTen());
                    dh.setChuyenNganh(dieuHoa.getChuyenNganh());
                    dh.setTinChi(dieuHoa.getTinChi());
                    return responsitory.save(dh);
                }).orElseGet(() -> responsitory.save(dieuHoa));
    }

    @Override
    public void xoa(Integer ma) {
        responsitory.deleteById(ma);
    }

    @Override
    public SinhVien getOne(Integer ma) {
        return responsitory.findByMa(ma);
    }

    @Override
    public List<SinhVien> getOne2(String chuyenNGhanh) {
        return responsitory.findByChuyenNganh(chuyenNGhanh);
    }


}
