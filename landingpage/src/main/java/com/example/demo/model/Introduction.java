package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "introductions")
public class Introductions {
    private long id;
    private String title;
    private String description;
    private Image image;

    public Introductions(String title, String description, Image image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToOne
    @MapsId
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
