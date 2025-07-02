package com.apitranslate.translate.infra.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.apitranslate.translate.domain.entity.Message;

import com.apitranslate.translate.infra.dto.RequestDto;

import com.apitranslate.translate.infra.dto.ResponseDto;

import com.apitranslate.translate.infra.mapper.RequestMapper;

import com.apitranslate.translate.infra.mapper.ResponseMapper;

import com.google.genai.Client;

import com.google.genai.types.GenerateContentResponse;

@Service
public class ResponseTranslateUseCase {

    @Autowired
    private RequestMapper requestMapper;

    @Autowired
    private ResponseMapper responseMapper;

    public ResponseDto translate(RequestDto request) {

        Message message = requestMapper.toEntity(request);

        String apiKey = System.getenv("API_KEY");

        Client client = Client.builder().apiKey(apiKey).build();

        GenerateContentResponse response = client.models.generateContent(
                "gemini-2.5-flash",
                message.buildMessage(),
                null);

        return responseMapper.toDto(response.text());
    }
}
