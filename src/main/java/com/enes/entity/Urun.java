package com.enes.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblurun")
@NamedQuery(name = "Urun.urunAra", query = "select u from Urun u where u.ad like concat('%', :arananKelime, '%') " + "order by case when u.ad = :arananKelime then 1 else 2 end, u.ad limit 10")


public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int kategoriId;
    @Column(length = 50,unique = true,nullable = false)
    String ad;
    String aciklama;
    Double fiyat;
    int stok;




}