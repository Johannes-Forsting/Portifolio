package com.example.myportfolio.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String portifolio(){
        return "frontPage";
    }
}
