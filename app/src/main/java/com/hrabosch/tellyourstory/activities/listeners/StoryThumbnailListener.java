package com.hrabosch.tellyourstory.activities.listeners;

import android.view.View;
import android.widget.TextView;

import com.hrabosch.tellyourstory.R;

public class StoryThumbnailListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        TextView idView = v.findViewById(R.id.story_id);
        // TODO Select story source from hashmap (needs to be implemented during loading) based on ID (key) to get source name (value)
    }
}
