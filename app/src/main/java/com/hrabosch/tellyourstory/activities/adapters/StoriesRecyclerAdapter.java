package com.hrabosch.tellyourstory.activities.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hrabosch.tellyourstory.R;
import com.hrabosch.tellyourstory.activities.listeners.StoryThumbnailListener;
import com.hrabosch.tellyourstory.entities.story.Story;
import com.hrabosch.tellyourstory.entities.story.StoryTag;

import java.util.List;


public class StoriesRecyclerAdapter extends RecyclerView.Adapter<StoriesRecyclerAdapter.StoriesRecyclerHolder> {

    private Context mContext;
    private List<Story> stories;


    public static class StoriesRecyclerHolder extends RecyclerView.ViewHolder {

        public TextView storyName;
        public TextView storyAuthor;
        public TextView storyShortDesc;
        public TextView storyId;
        public ViewGroup tagsLayout;

        public StoriesRecyclerHolder(View v) {
            super(v);
            v.setOnClickListener(new StoryThumbnailListener());
            storyName = v.findViewById(R.id.story_name);
            storyAuthor = v.findViewById(R.id.story_author);
            storyShortDesc = v.findViewById(R.id.story_short_description);
            storyId = v.findViewById(R.id.story_id);
            tagsLayout = v.findViewById(R.id.tag_linear_layout);
        }
    }

    public StoriesRecyclerAdapter(Context context, List<Story> stories) {
        this.mContext = context;
        this.stories = stories;
    }

    @Override
    public StoriesRecyclerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.story_thumbnail_entry, viewGroup, false);

        return new StoriesRecyclerHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesRecyclerHolder storiesRecyclerHolder, int i) {
        Story story = stories.get(i);
        storiesRecyclerHolder.storyId.setText(String.valueOf(story.getId()));
        storiesRecyclerHolder.storyName.setText(story.getMetadata().getName());
        storiesRecyclerHolder.storyShortDesc.setText(story.getMetadata().getShortDescription());
        storiesRecyclerHolder.storyAuthor.setText(story.getMetadata().getAuthor());
        for (StoryTag tag : story.getTags()) {
            TextView textViewTag = (TextView) View.inflate(mContext, R.layout.story_tag_view, null);
            textViewTag.setText(tag.getName());
            textViewTag.setBackgroundColor(Color.parseColor(tag.getHexaColor()));
            storiesRecyclerHolder.tagsLayout.addView(textViewTag);
        }
    }



    @Override
    public int getItemCount() {
        return stories.size();
    }
}
