package com.sai.url_shortner_api.service;

import com.sai.url_shortner_api.entity.Url;
import com.sai.url_shortner_api.repository.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    private final ShortCodeGenerator shortCodeGenerator;

    public UrlService(UrlRepository urlRepository, ShortCodeGenerator shortCodeGenerator) {
        this.urlRepository = urlRepository;
        this.shortCodeGenerator = shortCodeGenerator;
    }

    public List<Url> getAllUrls(){
        return urlRepository.findAll();
    }

    public Url getUrlById(Long id){
        return urlRepository.findById(id).orElseThrow(() -> new RuntimeException("URL Not Found"));
    }

    public Url getUrlByShortCode(String shortCode){
        return urlRepository.findByShortCode(shortCode).orElseThrow(() -> new RuntimeException("URL Not Found"));
    }

    public Url saveUrl(Url url){
        return urlRepository.save(url);
    }

    public Url createUrl(String originalUrl){
        String shortCode = shortCodeGenerator.generateShortCode();
        Url url = new Url(originalUrl, shortCode);
        return urlRepository.save(url);
    }
}
