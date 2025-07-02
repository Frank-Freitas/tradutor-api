package com.apitranslate.translate.infra.mapper;

import com.apitranslate.translate.domain.entity.Message;
import com.apitranslate.translate.infra.dto.RequestDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-02T15:41:03-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
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
