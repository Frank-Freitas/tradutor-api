package com.apitranslate.translate.inbound.advice;

import org.apache.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.apitranslate.translate.domain.exception.LanguageNotFoundException;

import com.apitranslate.translate.domain.exception.TextNotFoundException;

import com.apitranslate.translate.infra.dto.ErrorResponseDto;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHundler {

    @ExceptionHandler(LanguageNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleLanguageNotFound(LanguageNotFoundException ex,
            HttpServletRequest request) {

        ErrorResponseDto error = new ErrorResponseDto(HttpStatus.SC_BAD_REQUEST,
                "Bad Resquest",
                ex.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body(error);
    }

    @ExceptionHandler(TextNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleTextNotFound(TextNotFoundException ex,
            HttpServletRequest request) {
                
        ErrorResponseDto error = new ErrorResponseDto(HttpStatus.SC_BAD_REQUEST,
                "Bad request",
                ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body(error);
    }
}
