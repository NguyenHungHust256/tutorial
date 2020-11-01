//package com.example.demo2.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "article_tags")
//public class ArticleTag implements Serializable {
//    private String articleId;
//    private String tagId;
//
//    public ArticleTag() {
//    }
//
//    public ArticleTag(String articleId, String tagId) {
//        this.articleId = articleId;
//        this.tagId = tagId;
//    }
//
//    @Id
//    @Column(name = "acticleId", nullable = false)
//    public String getArticleId() {
//        return articleId;
//    }
//
//    public void setArticleId(String articleId) {
//        this.articleId = articleId;
//    }
//
//    @Id
//    @Column(name = "tagId",nullable = false)
//    public String getTagId() {
//        return tagId;
//    }
//
//    public void setTagId(String tagId) {
//        this.tagId = tagId;
//    }
//}
