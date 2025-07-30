package com.apitranslate.translate.infra.mapper;

import java.util.Set;

import org.mapstruct.Mapper;

import com.apitranslate.translate.infra.dto.ListResponseDto;

@Mapper(componentModel = "spring")
public interface ListResponseMapper {

    default ListResponseDto toDto(Set<String> dto) {
        ListResponseDto dtoo = new ListResponseDto();
        dtoo.setLanguages(dto);

        return dtoo;
    }
}
