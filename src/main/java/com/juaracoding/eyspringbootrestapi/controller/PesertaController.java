package com.juaracoding.eyspringbootrestapi.controller;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 27/07/2023 21:08
@Last Modified 27/07/2023 21:08
Version 1.0
*/
import com.juaracoding.eyspringbootrestapi.model.Peserta;
import com.juaracoding.eyspringbootrestapi.repo.PesertaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peserta")
public class PesertaController {

    @Autowired
    PesertaRepo pesertaRepo;

    @GetMapping("/")
    public List<Peserta> getAllData() {
        List<Peserta> daftarPeserta = pesertaRepo.findAll();
        return daftarPeserta;
    }

    @PostMapping("/")
    public String postData(@RequestBody Peserta peserta) {
//        pesertaRepo.delete(peserta);
        pesertaRepo.save(peserta);
        return peserta.getNama() + " berhasil ditambahkan";
    }

    @PostMapping("/batch")
    public String postData(@RequestBody List<Peserta> peserta) {
//        pesertaRepo.delete(peserta);
//        pesertaRepo.save(peserta);
        pesertaRepo.saveAll(peserta);
        return peserta.size()+" data berhasil ditambahkan";
    }

    @GetMapping("/search-peserta-by-id")
    public Peserta searchPesertaById(@RequestParam(value = "id") Integer id) {
        Optional<Peserta> hasil = pesertaRepo.findById(id);
        return hasil.get();
    }

    @GetMapping("/search-peserta-by-nama")
    public List<Peserta> searchPesertaByNama(@RequestParam(value = "nama") String nama) {
        List<Peserta> hasil = pesertaRepo.findByNama(nama);
        return hasil;
    }


}