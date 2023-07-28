package com.juaracoding.eyspringbootrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 26/07/2023 12:46
@Last Modified 26/07/2023 12:46
Version 1.0
*/
    @RestController
    @RequestMapping("/hello")
    public class HelloController{
        @GetMapping("/permisi")
        public String firstpage(){
            return "welcome";
        }
    }
