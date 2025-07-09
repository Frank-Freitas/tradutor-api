package com.apitranslate.translate.infra.mapper;

import com.apitranslate.translate.domain.entity.Message;
import com.apitranslate.translate.infra.dto.RequestDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-09T03:42:47-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class RequestMapperImpl implements RequestMapper {

    @Override
    public Message toEntity(RequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Message message = new Message();

        message.setText( getText(dto) );
        message.setLanguage( getLang(dto) );

        return message;
    }
}
