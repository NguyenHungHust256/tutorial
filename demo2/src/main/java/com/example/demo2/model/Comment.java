//package com.example.demo2.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "comments")
//public class Comment extends BaseEnity implements Serializable  {
//    private String id;
//    private String body;
//    private String articleId;
//    private String userId;
//
//    public Comment() {
//    }
//
//    public Comment(String id, String body, String articleId, String userId) {
//        this.id = id;
//        this.body = body;
//        this.articleId = articleId;
//        this.userId = userId;
//    }
//
//    @Id
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Column(name = "body", columnDefinition = "TEXT")
//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    @Column(name = "acticleId", nullable = false)
//    public String getArticleId() {
//        return articleId;
//    }
//
//    public void setArticleId(String articleId) {
//        this.articleId = articleId;
//    }
//
//    @Column(name = "userId", nullable = false)
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//}
