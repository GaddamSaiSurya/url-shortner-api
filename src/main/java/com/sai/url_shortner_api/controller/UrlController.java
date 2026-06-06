package com.sai.url_shortner_api.controller;

import com.sai.url_shortner_api.entity.Url;
import com.sai.url_shortner_api.service.UrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/urls")
    public List<Url> getAllUrls(){
        return urlService.getAllUrls();
    }

    @GetMapping("/urls/{id}")
    public Url getUrlById(@PathVariable Long id){
        return urlService.getUrlById(id);
    }

}
