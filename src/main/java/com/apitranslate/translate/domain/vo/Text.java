package com.apitranslate.translate.domain.vo;

import com.apitranslate.translate.domain.exception.TextNotFoundException;

public class Text {

    private String text;

    public Text(String text) {
        if (text == null || text.isBlank()) {
            throw new TextNotFoundException("Texto invalido");
        }
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
