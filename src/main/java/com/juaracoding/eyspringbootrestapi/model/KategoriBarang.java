package com.juaracoding.eyspringbootrestapi.model;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 31/07/2023 20:09
@Last Modified 31/07/2023 20:09
Version 1.0
*/

import javax.persistence.*;

@Entity
@Table(name = "MstKategoriBarang")
public class KategoriBarang {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "IdKategoriBarang")
    private Long idKategoriBarang;

    @Column(name = "idKategoriBarang")
    private String kategoriBarang;


    public Long getIdKategoriBarang() {
        return idKategoriBarang;
    }

    public void setIdKategoriBarang(Long idKategoriBarang) {
        this.idKategoriBarang = idKategoriBarang;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}
