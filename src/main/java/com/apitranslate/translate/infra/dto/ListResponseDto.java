package com.apitranslate.translate.infra.dto;

import java.util.Set;

public class ListResponseDto {
    
    private Set<String> languages;

    public ListResponseDto() {
    }

    public ListResponseDto(Set<String> languages) {
        this.languages = languages;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }
}
