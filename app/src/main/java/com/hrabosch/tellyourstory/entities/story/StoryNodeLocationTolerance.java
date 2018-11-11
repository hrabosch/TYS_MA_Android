package com.hrabosch.tellyourstory.entities.story;

public class StoryNodeLocationTolerance {
    private int value;
    private String units;

    public StoryNodeLocationTolerance(int value, String units) {
        this.value = value;
        this.units = units;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
