package com.hrabosch.tellyourstory.entities.story;

public class StoryContentNode {
    private Long id;
    private boolean end;
    private String heading;
    private String description;
    private StoryNodeLocation location;

    public StoryContentNode(Long id, boolean end, String heading, String description, StoryNodeLocation location) {
        this.id = id;
        this.end = end;
        this.heading = heading;
        this.description = description;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StoryNodeLocation getLocation() {
        return location;
    }

    public void setLocation(StoryNodeLocation location) {
        this.location = location;
    }
}
