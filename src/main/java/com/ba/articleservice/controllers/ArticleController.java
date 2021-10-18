package com.ba.articleservice.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ba.articleservice.entities.Article;
import com.mongodb.client.result.DeleteResult;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    MongoTemplate mongoTemplate;

    @GetMapping("/")
    public List<Article> getArticles(){
        return mongoTemplate.findAll(Article.class);
    }
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable String id){
        return mongoTemplate.findById(id, Article.class);
    }
    @PostMapping("/")
    public Article createArticle(@RequestBody Article article){
        return mongoTemplate.save(article);
    }
    @DeleteMapping("/{id}")
    public DeleteResult deleteArticle(@PathVariable String id){
        Article a = mongoTemplate.findById(id, Article.class);
        return mongoTemplate.remove(a);
    }
}
