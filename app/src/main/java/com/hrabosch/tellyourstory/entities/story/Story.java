package com.hrabosch.tellyourstory.entities.story;

import java.util.List;

public class Story {

    private Long id;
    private StoryMetadata metadata;
    private List<StoryTag> tags;
    private List<StoryContentNode> content;

    public Story(Long id, StoryMetadata metadata, List<StoryTag> tags, List<StoryContentNode> content) {
        this.id = id;
        this.metadata = metadata;
        this.tags = tags;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StoryMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(StoryMetadata metadata) {
        this.metadata = metadata;
    }

    public List<StoryTag> getTags() {
        return tags;
    }

    public void setTags(List<StoryTag> tags) {
        this.tags = tags;
    }

    public List<StoryContentNode> getContent() {
        return content;
    }

    public void setContent(List<StoryContentNode> content) {
        this.content = content;
    }
}
