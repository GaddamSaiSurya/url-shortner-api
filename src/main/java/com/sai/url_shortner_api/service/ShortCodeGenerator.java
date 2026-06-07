package com.sai.url_shortner_api.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ShortCodeGenerator {

    private static final String CHARACTERS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private static final int SHORT_CODE_LENGTH = 6;

    private final Random random = new Random();

    public char generateRandomCharacter(){
        int index = random.nextInt(CHARACTERS.length());
        return CHARACTERS.charAt(index);
    }

    public String generateShortCode(){

        StringBuilder shortCode = new StringBuilder();
        for(int i = 0; i < SHORT_CODE_LENGTH; i++){
            shortCode.append(generateRandomCharacter());
        }
        return shortCode.toString();
    }
}
