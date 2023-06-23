package com.example.demo.Lab56;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dieuhoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DieuHoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madieuhoa")
    private Integer maDieuHoa;
    @Column(name = "tendieuhoa")

    private String tenDieuHoa;
    @Column(name = "loaidieuhoa")

    private Boolean loaiDieuHoa;
    @Column(name = "congxuat")

    private Integer congXuat;
    @Column(name = "luuluonggio")

    private Integer luuluongGio;


}
