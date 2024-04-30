package com.Nteam.backend.translate.service;

import com.deepl.api.TextResult;
import com.deepl.api.Translator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransKakaoService {


    public String translate(String sentence, String language) throws Exception {
        Translator translator;
        String authKey = "300146b9-57bd-413d-9693-610ccdc57af3:fx";  // Replace with your key
        translator = new Translator(authKey);
        TextResult result =
                translator.translateText(sentence, null, language);
        return result.getText();
    }
}
