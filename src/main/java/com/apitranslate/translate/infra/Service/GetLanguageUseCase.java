package com.apitranslate.translate.infra.Service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.apitranslate.translate.domain.util.Language;

@Service
public class GetLanguageUseCase {

    public Set<String> get() {
        return Language.getLanguages();
    }
}
