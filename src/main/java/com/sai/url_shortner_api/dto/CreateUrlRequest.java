package com.sai.url_shortner_api.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateUrlRequest {

    @NotBlank(message = "Original Url cannot be blank")
    private String originalUrl;

    public CreateUrlRequest() {
    }

    public CreateUrlRequest(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}
