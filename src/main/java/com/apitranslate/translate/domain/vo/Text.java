package com.apitranslate.translate.domain.vo;

import com.apitranslate.translate.domain.exception.TextNotFoundException;

import com.apitranslate.translate.domain.exception.TextSizeLimitException;

public class Text {

    private String text;

    public Text(String text) {
        if (text == null || text.isBlank()) {
            throw new TextNotFoundException("Texto invalido. Mensagem não pode estar em branco");
        }
        if(text.length() > 6000){
            throw new TextSizeLimitException("Limite de caracteres excedido");
        }
        
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
