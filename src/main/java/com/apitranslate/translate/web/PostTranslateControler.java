package com.apitranslate.translate.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.apitranslate.translate.infra.Service.ResponseTranslateUseCase;

import com.apitranslate.translate.infra.dto.RequestDto;

import com.apitranslate.translate.infra.dto.ResponseDto;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class PostTranslateControler {

    @Autowired
    ResponseTranslateUseCase translateCase;

    @PostMapping
    public ResponseEntity<ResponseDto> post(@RequestBody RequestDto request) {
        ResponseDto res = translateCase.translate(request);
        return ResponseEntity.ok().body(res);

    }

}