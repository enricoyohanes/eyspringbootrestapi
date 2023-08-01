package com.juaracoding.eyspringbootrestapi.repo;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 27/07/2023 21:21
@Last Modified 27/07/2023 21:21
Version 1.0
*/
import com.juaracoding.eyspringbootrestapi.model.Peserta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Transactional
public interface PesertaRepo extends JpaRepository<Peserta,Integer> {

    List<Peserta> findByNama(String strNama);//DERIVED QUERY
//    List<Peserta> findByNamaStartWith(String strNama);//DERIVED QUERY
    void deleteByNama(String strNama);

}

