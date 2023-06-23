package com.example.demo.buoi6;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderResponsitory extends JpaRepository<Oder,Integer> {
}
