package com.example.firstproject.service;

import com.example.firstproject.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public class ArticleService {

    @Service
    @RequiredArgsConstructor
    public class ArticleService {
        private final ArticleRepository articleRepository;


    }

}
