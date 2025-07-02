package com.apitranslate.translate.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.apitranslate.translate.infra.Service.GetLanguageUseCase;

@RestController
@RequestMapping
public class GetLanguageController {

    @Autowired
    private GetLanguageUseCase language;

    @GetMapping("/pais")
    public Set<String> getPaises() {
        return language.get();
    }

}
