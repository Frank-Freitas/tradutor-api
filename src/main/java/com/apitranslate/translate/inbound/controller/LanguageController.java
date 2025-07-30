package com.apitranslate.translate.inbound.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

// import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.apitranslate.translate.infra.dto.ListResponseDto;

import com.apitranslate.translate.infra.service.LanguageUseCase;

@RestController
@RequestMapping
public class LanguageController {

    @Autowired
    private LanguageUseCase languageUseCase;

    @GetMapping("/idioma")
    // @CrossOrigin(origins = "http://localhost:5173/")
    public ResponseEntity<ListResponseDto> getPaises() {
        ListResponseDto res = languageUseCase.get();
        return ResponseEntity.ok().body(res);
    }
}
