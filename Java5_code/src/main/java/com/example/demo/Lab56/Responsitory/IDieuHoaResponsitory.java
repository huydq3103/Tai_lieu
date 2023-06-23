//package com.example.demo.Lab56.Responsitory;
//
//import com.example.demo.Lab56.DieuHoa;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface IDieuHoaResponsitory extends JpaRepository<DieuHoa, Integer> {
//    DieuHoa findByMaDieuHoa(Integer ma);
//
//    @Query("""
//                    select d from DieuHoa d order by d.luuluongGio asc
//            """)
//    Page<DieuHoa> findAllPanable(Pageable pageable);
//}
