package com.apitranslate.translate.infra.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.apitranslate.translate.infra.dto.RequestDto;

import com.apitranslate.translate.infra.dto.ResponseDto;

import com.apitranslate.translate.infra.mapper.RequestMapper;

import com.apitranslate.translate.infra.mapper.ResponseMapper;

import com.apitranslate.translate.outbound.ClientContract;

@Service
public class TranslateUseCase {

    @Autowired
    private RequestMapper requestMapper;

    @Autowired
    private ResponseMapper responseMapper;

    @Autowired
    ClientContract clientContract;

    public ResponseDto translate(RequestDto request) {
        return responseMapper
        .toDto(clientContract
        .clientConect(requestMapper
        .toEntity(request)));
    }
}
