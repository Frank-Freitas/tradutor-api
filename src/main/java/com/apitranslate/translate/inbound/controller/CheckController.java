package com.apitranslate.translate.inbound.controller;

import org.springframework.web.bind.annotation.RequestMapping;

// import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CheckController {

    @GetMapping("/")
    // @CrossOrigin(origins = "http://localhost:5173/")
    public String ping() {
        return "API Online";
    }
}
