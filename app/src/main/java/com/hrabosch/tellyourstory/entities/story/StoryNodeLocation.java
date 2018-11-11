package com.hrabosch.tellyourstory.entities.story;

public class StoryNodeLocation {
    private Float latitude;
    private Float longitude;
    private StoryNodeLocationTolerance tolerance;

    public StoryNodeLocation(Float latitude, Float longitude, StoryNodeLocationTolerance tolerance) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.tolerance = tolerance;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public StoryNodeLocationTolerance getTolerance() {
        return tolerance;
    }

    public void setTolerance(StoryNodeLocationTolerance tolerance) {
        this.tolerance = tolerance;
    }
}
