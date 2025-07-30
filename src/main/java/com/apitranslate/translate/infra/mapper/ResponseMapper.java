package com.apitranslate.translate.infra.mapper;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping;

import com.apitranslate.translate.infra.dto.ResponseDto;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

    @Mapping(target = "text", source = "response")
    public ResponseDto toDto(String response);
}
