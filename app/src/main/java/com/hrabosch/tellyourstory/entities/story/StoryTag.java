package com.hrabosch.tellyourstory.entities.story;

public class StoryTag {
    private String name;
    private String hexaColor;

    public StoryTag(String name, String hexaColor) {
        this.name = name;
        this.hexaColor = hexaColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexaColor() {
        return hexaColor;
    }

    public void setHexaColor(String hexaColor) {
        this.hexaColor = hexaColor;
    }
}
