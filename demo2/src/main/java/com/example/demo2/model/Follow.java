//package com.example.demo2.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "follows")
//public class Follow implements Serializable {
//    private String userId;
//    private String followId;
//
//    public Follow() {
//    }
//
//    public Follow(String userId, String followId) {
//        this.userId = userId;
//        this.followId = followId;
//    }
//
//    @Id
//    @Column(name = "userId")
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    @Id
//    @Column(name = "followId", nullable = false)
//    public String getFollowId() {
//        return followId;
//    }
//
//    public void setFollowId(String followId) {
//        this.followId = followId;
//    }
//}
