package com.apitranslate.translate.outbound.clients;

import org.springframework.stereotype.Service;

import com.apitranslate.translate.domain.entity.Message;

import com.apitranslate.translate.outbound.ClientContract;

import com.google.genai.Client;

import com.google.genai.types.GenerateContentResponse;

import io.github.cdimascio.dotenv.Dotenv;

@Service("GeminiApiService")
public class GeminiApi implements ClientContract {

    @Override
    public String clientConect(Message message) {
        Dotenv env = Dotenv.load();
        String apiKey = env.get("key");
        Client client = Client.builder().apiKey(apiKey).build();
        GenerateContentResponse response = client.models.generateContent(
                "gemini-2.5-flash",
                message.buildMessage(),
                null);

        return response.text();
    }
}
