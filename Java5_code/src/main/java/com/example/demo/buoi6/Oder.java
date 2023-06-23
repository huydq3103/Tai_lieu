package com.example.demo.buoi6;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "`order`")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Oder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`orderid`")
    private Integer OrderId;

    @Column(name = "`createddate`")
    private Date CreatedDate;

    @Column(name = "`customernumber`")
    private String CustomerNumber;

}

