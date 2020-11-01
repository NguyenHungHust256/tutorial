package com.example.demo2.service;

import com.example.demo2.model.Article;
import com.example.demo2.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article save(Article article){
        return articleRepository.save(article);
    }

    public List<Article> findAll(){
        return articleRepository.findAll();
    }


}
