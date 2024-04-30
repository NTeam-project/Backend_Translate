package com.Nteam.backend.translate.controller;

import com.Nteam.backend.translate.service.TransKakaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TransKakaoController {

    private final TransKakaoService service;

    @GetMapping("/translate/{sentence}/{language}")
    public String translate(@PathVariable(value = "sentence") String sentence, @PathVariable(value = "language") String language) throws Exception {
        System.out.print(sentence);
        System.out.print(language);
        String translatedText = service.translate(sentence, language);

        return translatedText;
    }

}