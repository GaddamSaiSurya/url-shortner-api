package com.sai.url_shortner_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

@Entity
@Table(name = "urls")
public class Url {

    @Id
    @SequenceGenerator(
            name = "url_sequence",
            sequenceName = "url_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "url_sequence"
    )

    private Long id;
    @Column(nullable = false)
    private String originalUrl;
    @Column(nullable = false, unique = true)
    private String shortCode;
    @Column(nullable = false)
    private LocalDateTime createdAt;

    public Url() {
    }

    public Url(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Url{" +
                "id=" + id +
                ", originalUrl='" + originalUrl + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
