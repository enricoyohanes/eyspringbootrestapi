package com.juaracoding.eyspringbootrestapi.model;

import javax.persistence.*;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 31/07/2023 20:11
@Last Modified 31/07/2023 20:11
Version 1.0
*/

@Entity
@Table(name = "MstBarang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBarang")
    private Long idBarang;

    @Column(name = "NamaBarang")
    private String namaBarang;

    @Column(name = "Merk")
    private String merk;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDKategoriBarang", referencedColumnName = "IDKategoriBarang")
    private String KategoriBarang kategoriBarang ;

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
