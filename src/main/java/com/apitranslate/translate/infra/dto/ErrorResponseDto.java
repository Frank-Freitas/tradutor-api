package com.apitranslate.translate.infra.dto;

import java.time.LocalDateTime;

public class ErrorResponseDto {

    private LocalDateTime timestamp;

    private int status;

    private String messageError; // bad request

    private String specificMessageError; // mesagem que vem do throw exception especifico

    private String pathUrl; // Caminho da URL que gerou o erro

    public ErrorResponseDto(int status, String messageError, String specificMessageError,
            String pathUrl) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.messageError = messageError;
        this.specificMessageError = specificMessageError;
        this.pathUrl = pathUrl;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public String getSpecificMessageError() {
        return specificMessageError;
    }

    public void setSpecificMessageError(String specificMessageError) {
        this.specificMessageError = specificMessageError;
    }

    public String getPathUrl() {
        return pathUrl;
    }

    public void setPathUrl(String pathUrl) {
        this.pathUrl = pathUrl;
    }
}
