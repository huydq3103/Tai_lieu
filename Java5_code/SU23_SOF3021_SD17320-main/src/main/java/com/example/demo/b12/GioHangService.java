package com.example.demo.b12;

import com.example.demo.b7.IProductRepository;
import com.example.demo.b7.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GioHangService {

    @Autowired
    private GioHangRepository repository;

    @Autowired
    private IProductRepository sanPhamRepository;

    public void themSanPhamVaoGio(Integer maSanPham, Integer soLuongThem) {
        if (repository.sanPhamDaCoTrongGio(maSanPham)) {
            repository.themSanPhamVaoGio(maSanPham, soLuongThem);
        } else {
            Integer soLuongHienCo = repository.laySoLuongSanPhamTrongGio(maSanPham);
            Integer soLuongCongDon = soLuongHienCo + soLuongThem;
            repository.suaSoLuongSanPhamTrongGio(maSanPham, soLuongCongDon);
        }
    }

    public void boSanPhamKhoiGio(Integer maSanPham, Integer soLuongBo) {
        //...
    }

    public GioHangViewModel xemGioHang() {
        GioHangDomainModel gioHangDomainModel = repository.layGioHang();
        Map<Integer, Integer> danhSachSanPham = gioHangDomainModel.getDanhSachSanPham();

        GioHangViewModel viewModel = new GioHangViewModel();
        for(Map.Entry<Integer, Integer> sp : danhSachSanPham.entrySet()) {
            Integer maSanPham = sp.getKey();
            Integer soLuong = sp.getValue();

            Product sanPham = sanPhamRepository.findById(maSanPham).get();

            SanPhamTrongGioViewModel sptg = new SanPhamTrongGioViewModel();
            sptg.setMaSanPham(maSanPham);
            sptg.setSoLuong(soLuong);
            sptg.setDonGia(sanPham.getPrice());
            sptg.setTenSanPham(sanPham.getProductName());

            viewModel.getSanPham().add(sptg);
        }

        return viewModel;
    }
}
