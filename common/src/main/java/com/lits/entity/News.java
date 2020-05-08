package com.lits.entity;

public class News {

    private String author;
    private String title;
    private String description;
    private String publishedAt;
    private String content;

    @Override
    public String toString() {
        return "News{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
