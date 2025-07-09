package com.apitranslate.translate.infra.mapper;

import com.apitranslate.translate.infra.dto.ResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-09T03:24:12-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
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
