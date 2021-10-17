package com.ba.articleservice.controllers;

import java.util.List;

import com.ba.articleservice.entities.Article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/")
    public List<Article> getArticles(){
        return null;
    }
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable long id){
        return null;
    }
}