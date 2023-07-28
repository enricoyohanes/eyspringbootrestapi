package com.juaracoding.eyspringbootrestapi.model;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 26/07/2023 20:58
@Last Modified 26/07/2023 20:58
Version 1.0
*/
import javax.persistence.*;

@Entity
@Table(name = "Peserta")
public class Peserta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nama;
    private String batch;
    private String alamat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
