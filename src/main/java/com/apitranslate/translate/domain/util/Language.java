package com.apitranslate.translate.domain.util;

import java.util.Set;

public final class Language {
    private static final Set<String> LANGUAGES = Set.of(
            "Português (Brasil)", "Português (Portugal)", "Inglês (Americano)",
            "Inglês (Britânico)", "Espanhol (Castelhano)", "Espanhol (Latino-americano)",
            "Chinês (Mandarim Simplificado)", "Japonês", "Coreano", "Árabe", "Russo",
            "Hindi", "Francês", "Alemão", "Italiano");

    private Language() {
    }

    public static Set<String> getLanguages() {
        return LANGUAGES;
    }
}