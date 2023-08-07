package com.juaracoding.eyspringbootrestapi.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 02/08/2023 22:23
@Last Modified 02/08/2023 22:23
Version 1.0
*/

@Entity
@Table(name = "MstTugasA")
public class TugasA {
    @Id
    @Column(name = "IdTugasA")
    private String idTugasA;

    @Length (min = 5, max = 40)
    @NotNull
    @NotEmpty
    @NotBlank
    @Column (name = "Nama", length = 40, nullable = false)
    private String nama;
    @NotNull
    @Column(name = "Alamat", length = 500)
    private String alamat;
    @NotNull
    @Column(name = "TanggalLahir")
    private LocalDate tanggalLahir;
    @NotNull
    @Column(name = "JenisKelamin", length = 1)
    private String jenisKelamin;
    @NotNull
    @Column(name = "MasihHidup")
    private Boolean masihHidup;
    @NotNull
    @Column (name = "CreatedDate", length = 7, nullable = false)
    private Date createdDate = new Date();
    @NotNull
    @Column (name = "CreatedBy", length = 7, nullable = false)
    private Long createdBy = 1L;
    @Column (name = "ModifiedDate")
    private Date modifiedDate;
    @Column (name = "ModifiedBy")
    private Long modifiedBy;
    @NotNull
    @Column(name = "IsDelete")
    private Byte isDelete;

    public String getIdTugasA() {
        return idTugasA;
    }

    public void setIdTugasA(String idTugasA) {
        this.idTugasA = idTugasA;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Boolean getMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(Boolean masihHidup) {
        this.masihHidup = masihHidup;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}
