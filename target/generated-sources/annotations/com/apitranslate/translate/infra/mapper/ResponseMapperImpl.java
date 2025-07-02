package com.apitranslate.translate.infra.mapper;

import com.apitranslate.translate.infra.dto.ResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-02T13:38:09-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class ResponseMapperImpl implements ResponseMapper {

    @Override
    public ResponseDto toDto(String response) {
        if ( response == null ) {
            return null;
        }

        ResponseDto responseDto = new ResponseDto();

        responseDto.setText( response );

        return responseDto;
    }
}
