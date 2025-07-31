package com.apitranslate.translate.domain.entity;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

import com.apitranslate.translate.domain.exception.LanguageNotFoundException;

public class MessageTest {
    
    private Message message = new Message();

    @Test 
    void setLanguage_withExistingLanguage_returnLanguage(){
        message.setLanguage("Português (Brasil)");
        Assertions.assertThat(message.getLanguage()).isEqualTo("Português (Brasil)");
    }

    @Test
    void setLanguage_withNullLanguage_throwsException(){
        Assertions.assertThatThrownBy(() -> message.setLanguage(null))
        .isInstanceOf(LanguageNotFoundException.class)
        .hasMessage("Idioma invalido");
    }

     @Test
    void setLanguage_withBlankLanguage_throwsException(){
        Assertions.assertThatThrownBy(() -> message.setLanguage(""))
        .isInstanceOf(LanguageNotFoundException.class)
        .hasMessage("Idioma invalido");
    }


    @Test 
    void setLanguage_withUexistingLanguage_ThrowsException(){
        Assertions.assertThatThrownBy(()-> message.setLanguage("Idioma que não existe"))
        .isInstanceOf(LanguageNotFoundException.class)
        .hasMessageContaining("Idioma invalido");
    }

    @Test
    void constructorMessage_withUnexistingLanguage_throwsException(){
        Assertions.assertThatThrownBy(() -> new Message("Test", "idioma que não existe"))
        .isInstanceOf(LanguageNotFoundException.class)
        .hasMessageContaining("Idioma invalido");
    }
}
