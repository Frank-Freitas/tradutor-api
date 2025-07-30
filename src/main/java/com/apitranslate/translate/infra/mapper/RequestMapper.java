package com.apitranslate.translate.infra.mapper;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping;

import com.apitranslate.translate.infra.dto.RequestDto;

import com.apitranslate.translate.domain.entity.Message;

@Mapper(componentModel = "spring")
public interface RequestMapper {

    @Mapping(target = "text", expression = "java(getText(dto))")
    @Mapping(target = "language", expression = "java(getLang(dto))")
    public Message toEntity(RequestDto dto);

    default String getText(RequestDto dto) {
        return dto.getText();
    }

    default String getLang(RequestDto dto) {
        return dto.getLanguage();
    }
}
