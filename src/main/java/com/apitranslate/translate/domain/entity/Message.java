package com.apitranslate.translate.domain.entity;

import com.apitranslate.translate.domain.exception.LanguageNotFoundException;

import com.apitranslate.translate.domain.util.Language;

import com.apitranslate.translate.domain.vo.Text;

public class Message {

    private Text text;

    private String language;

    public Message() {
    }

    public Message(String text, String language) {
        if (language == null || language.isBlank()) {
            throw new LanguageNotFoundException("Idioma invalido");
        }
        if (!Language.getLanguages().contains(language)) {
            throw new LanguageNotFoundException("Idioma invalido");
        }
        this.text = new Text(text);
        this.language = language;
    }

    public void setText(String text) {
        this.text = new Text(text);
    }

    public String getText() {
        return text.getText();
    }

    public void setLanguage(String language) {
        if (language == null || language.isBlank()) {
            throw new LanguageNotFoundException("Idioma invalido");
        }
        if (!Language.getLanguages().contains(language)) {
            throw new LanguageNotFoundException("Idioma invalido");
        }
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String buildMessage() {
        return "De forma inteligente, ajustando erros de ortografia, traduza este texto ("
                + text.getText()
                + "), sem mudar o significado, apenas refatorando para o idioma "
                + language
                + ", e não responda nada além da tradução que foi pedida.";
    }
}
