package com.hrabosch.tellyourstory.entities.story;

public class StoryMetadata {
    private String name;
    private String author;
    private String shortDescription;
    private String description;
    private String language;

    public StoryMetadata(String name, String author, String shortDescription, String description, String language) {
        this.name = name;
        this.author = author;
        this.shortDescription = shortDescription;
        this.description = description;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
