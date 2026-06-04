package com.sai.url_shortner_api.controller;

import com.sai.url_shortner_api.entity.Url;
import com.sai.url_shortner_api.service.UrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/url")
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping
    public List<Url> getAllUrl(){
        return urlService.getAllUrl();
    }
}
