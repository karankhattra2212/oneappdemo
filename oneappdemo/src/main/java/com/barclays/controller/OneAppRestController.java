package com.barclays.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneAppRestController {

    /*@PostMapping
    public void saveTermsAndCond() {
        //To do Vatsala
    }*/

    @GetMapping(value = "/hello")
    public String getTermsAndCond() {
        System.out.print("Inside hello method!!!!!!!!!!!!!!!!");
        return "hello World to Barclays";
    }

    @GetMapping(value = "/getName")
    public String getName() {
        System.out.print("Inside hello method!!!!!!!!!!!!!!!!");
        return "<h1>Paramveer Singh</h1>";
    }

}
