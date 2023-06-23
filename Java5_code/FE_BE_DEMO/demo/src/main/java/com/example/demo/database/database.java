package com.example.demo.database;

import com.example.demo.Responsitories.ProductResponsitory;
import com.example.demo.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.Database;

import java.util.List;

@Configuration // tao cac bean chay dau tien khi chuong trinh bat dau
public class database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean // chay ngay khi app dc chay
    CommandLineRunner  initdatbase(ProductResponsitory productResponsitory){
         return new CommandLineRunner() {
             @Override
             public void run(String... args) throws Exception {
//                 Product pruct1 = new Product("iphon12", 15F,"okk1");
//                 Product product2 = new Product("iphon14", 12F,"okk2");
//                 logger.info("insert dat "+productResponsitory.save(pruct1));
//                 logger.info("insert dat "+productResponsitory.save(product2));
             }
         };
    }


}
