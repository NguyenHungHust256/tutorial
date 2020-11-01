package com.example.demo2.controller;

import com.example.demo2.model.Article;
import com.example.demo2.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RolesAllowed({"admin", "user"})
    @PostMapping("/create-article")
    public Article createIntro(@RequestHeader String Authorization, @RequestBody Article article) {
        return articleService.save(article);
    }

    @GetMapping("/articles")
    public List<Article> getAll() {
        return articleService.findAll();
    }
}
