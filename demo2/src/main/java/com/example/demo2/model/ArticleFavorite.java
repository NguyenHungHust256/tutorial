//package com.example.demo2.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "article_favorites")
//public class ArticleFavorite implements Serializable {
//    private String articleId;
//    private String userId;
//
//    public ArticleFavorite() {
//    }
//
//    public ArticleFavorite(String articleId, String userId) {
//        this.articleId = articleId;
//        this.userId = userId;
//    }
//
//    @Id
//    @Column(name = "articleId", nullable = false)
//    public String getArticleId() {
//        return articleId;
//    }
//
//    public void setArticleId(String articleId) {
//        this.articleId = articleId;
//    }
//
//    @Id
//    @Column(name = "userId", nullable = false)
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//}
