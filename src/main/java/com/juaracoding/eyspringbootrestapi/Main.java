package com.juaracoding.eyspringbootrestapi;

import com.juaracoding.eyspringbootrestapi.model.XPerson;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 29/07/2023 13:04
@Last Modified 29/07/2023 13:04
Version 1.0
*/
public class Main {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("idPerson",1);
        map.put("namaLengkap", "Enricooo");
        map.put("tanggalLahir","1998-07-05");
        map.put("email","ricoy@gmail.com");

        XPerson xperson = new XPerson();
        xperson.setIdPerson(1L);
        xperson.setNamaLengkap("Enricooo");
        xperson.setTanggalLahir(LocalDate.now());
        xperson.setEmail("ricoy@gmail.com");
    }
}
