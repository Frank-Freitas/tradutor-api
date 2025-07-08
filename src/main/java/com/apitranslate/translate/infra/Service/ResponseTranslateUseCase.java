package com.apitranslate.translate.infra.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.apitranslate.translate.domain.entity.Message;

import com.apitranslate.translate.infra.dto.RequestDto;

import com.apitranslate.translate.infra.dto.ResponseDto;

import com.apitranslate.translate.infra.mapper.RequestMapper;

import com.apitranslate.translate.infra.mapper.ResponseMapper;

import com.google.genai.Client;

import com.google.genai.types.GenerateContentResponse;

import io.github.cdimascio.dotenv.Dotenv;

@Service
public class ResponseTranslateUseCase {

    @Autowired
    private RequestMapper requestMapper;

    @Autowired
    private ResponseMapper responseMapper;

    public ResponseDto translate(RequestDto request) {
        Dotenv env = Dotenv.load();

        String apiKey = env.get("key");

        Message message = requestMapper.toEntity(request);

        Client client = Client.builder().apiKey(apiKey).build();

        GenerateContentResponse response = client.models.generateContent(
                "gemini-2.5-flash",
                message.buildMessage(),
                null);

        return responseMapper.toDto(response.text());
    }
}
