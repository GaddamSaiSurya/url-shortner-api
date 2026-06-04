package com.sai.url_shortner_api.dto;

import java.time.LocalDateTime;

public class UrlResponse {

    private String shortCode;
    private String originalUrl;
    private LocalDateTime createdAt;

    public UrlResponse() {
    }

    public UrlResponse(String shortCode, String originalUrl, LocalDateTime createdAt) {
        this.shortCode = shortCode;
        this.originalUrl = originalUrl;
        this.createdAt = createdAt;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "UrlResponse{" +
                "shortCode='" + shortCode + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
