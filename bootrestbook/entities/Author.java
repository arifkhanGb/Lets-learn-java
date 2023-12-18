package com.api.book.bootrestbook.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    String authorName;
    String authorLanguage;

    public Author() {
        super();
    }

    public Author(int authorId, String authorName, String authorLanguage) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorLanguage = authorLanguage;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLanguage() {
        return authorLanguage;
    }

    public void setAuthorLanguage(String authorLanguage) {
        this.authorLanguage = authorLanguage;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorLanguage='" + authorLanguage + '\'' +
                '}';
    }
}
