package com.sai.url_shortner_api.service;

import com.sai.url_shortner_api.entity.Url;
import com.sai.url_shortner_api.repository.UrlRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public List<Url> getAllUrl(){
        return urlRepository.findAll();
    }
}
