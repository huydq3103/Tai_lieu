//package com.example.demo.Lab56.service;
//
//import com.example.demo.Lab56.DieuHoa;
//import com.example.demo.Lab56.Responsitory.IDieuHoaResponsitory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class DieuHoaServiceIPLM implements IDieuHoaService {
//
//    @Autowired
//    private IDieuHoaResponsitory responsitory;
//
//
//    @Override
//    public Page<DieuHoa> getALl(Optional<Integer> pageNo) {
//        Pageable pageable = PageRequest.of(pageNo.orElse(0), 5);
//        return responsitory.findAllPanable(pageable);
//    }
//
////    @Override
////    public Page<DieuHoa> findByName(String name, Optional<Integer> pageNo) {
////        Pageable pageable = PageRequest.of(pageNo.orElse(0), 10);
////        return responsitory.findAll(name,pageable);
////
////    }
//
//    @Override
//    public void them(DieuHoa dieuHoa) {
//        responsitory.save(dieuHoa);
//    }
//
//    @Override
//    public void sua(DieuHoa dieuHoa, Integer ma) {
//        responsitory.findById(ma)
//                .map(dh -> {
//                    dh.setTenDieuHoa(dieuHoa.getTenDieuHoa());
//                    dh.setLoaiDieuHoa(dieuHoa.getLoaiDieuHoa());
//                    dh.setCongXuat(dieuHoa.getCongXuat());
//                    dh.setLuuluongGio(dieuHoa.getLuuluongGio());
//                    return responsitory.save(dh);
//                }).orElseGet(() -> responsitory.save(dieuHoa));
//    }
//
//    @Override
//    public void xoa(Integer ma) {
//        responsitory.deleteById(ma);
//    }
//
//    @Override
//    public DieuHoa getOne(Integer ma) {
//        return responsitory.findByMaDieuHoa(ma);
//    }
//}
