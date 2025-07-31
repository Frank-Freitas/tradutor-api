package com.apitranslate.translate.domain.vo;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import com.apitranslate.translate.domain.exception.TextNotFoundException;

import com.apitranslate.translate.domain.exception.TextSizeLimitException;

import com.apitranslate.translate.domain.vo.util.CaracterSize;

@ExtendWith(MockitoExtension.class)
public class TextTest {

  private Text text;

  @Test
  void addText_withEmptyText_throwsException() {
    Assertions.assertThatThrownBy(() -> new Text(""))
      .isInstanceOf(TextNotFoundException.class)
      .hasMessage("Texto invalido. Mensagem não pode estar em branco");
  }

  @Test
  void addText_withNullText_throwsException() {
    Assertions.assertThatThrownBy(() -> new Text(null))
        .isInstanceOf(TextNotFoundException.class)
        .hasMessage("Texto invalido. Mensagem não pode estar em branco");
  }

  @Test
  void getText_withExistingText_returnText() {
    text = new Text("Hello world");
    Assertions.assertThat(text.getText())
        .isEqualTo("Hello world");
  }

  @Test
  void textSizeLimit_withExistingText_throwsException(){
    String  msg = CaracterSize.get6001Char();
    Assertions.assertThatThrownBy(() -> new Text(msg))
    .isInstanceOf(TextSizeLimitException.class)
    .hasMessage("Limite de caracteres excedido");
  }
}
