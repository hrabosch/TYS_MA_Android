package com.hrabosch.tellyourstory;

import android.app.Application;

import com.google.gson.Gson;
import com.hrabosch.tellyourstory.activities.SplashScreenActivity;
import com.hrabosch.tellyourstory.entities.story.Story;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TysApp extends Application {

    private List<Story> stories = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new SplashScreenActivity());
        loadStoryDataFiles();
    }

    private void loadStoryDataFiles() {
        InputStream gaiaStoryInputStream = getResources().openRawResource(R.raw.test);
        final Gson gson = new Gson();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(gaiaStoryInputStream));
        this.stories.add(gson.fromJson(reader, Story.class));
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
