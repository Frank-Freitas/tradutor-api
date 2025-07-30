package com.apitranslate.translate.inbound.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

// import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.apitranslate.translate.infra.dto.RequestDto;

import com.apitranslate.translate.infra.dto.ResponseDto;

import com.apitranslate.translate.infra.service.TranslateUseCase;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class PostTranslateControler {

    @Autowired
    TranslateUseCase translateCase;

    @PostMapping("/")
    // @CrossOrigin(origins = "http://localhost:5173/")
    public ResponseEntity<ResponseDto> post(@RequestBody RequestDto request) {
        ResponseDto res = translateCase.translate(request);
        return ResponseEntity.ok().body(res);
    }
}