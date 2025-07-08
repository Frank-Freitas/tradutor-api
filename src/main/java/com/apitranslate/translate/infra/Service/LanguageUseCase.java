package com.apitranslate.translate.infra.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.apitranslate.translate.domain.util.Language;

import com.apitranslate.translate.infra.dto.ListResponseDto;

import com.apitranslate.translate.infra.mapper.ListResponseMapper;

@Service
public class LanguageUseCase {

    @Autowired
    ListResponseMapper mapper;

    public ListResponseDto get() {
        Set<String> res = Language.getLanguages();
        ListResponseDto response = mapper.toDto(res);
        return response;
    }
}
