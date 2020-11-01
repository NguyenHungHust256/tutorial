package com.example.demo2.model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Articles")
public class Article extends BaseEnity implements Serializable {
    private String id;
    private String userId;
    private String 
    private String slug;
    private String title;
    private String description;
    private String body;

    public Article() {
    }

    public Article(String id, String userId, String slug, String title, String description, String body) {
        this.id = id;
        this.userId = userId;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "userId", nullable = false)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "slug", unique = true)
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "body", nullable = false, columnDefinition = "TEXT")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
