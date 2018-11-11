package com.hrabosch.tellyourstory.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hrabosch.tellyourstory.R;
import com.hrabosch.tellyourstory.TysApp;
import com.hrabosch.tellyourstory.activities.adapters.StoriesRecyclerAdapter;

public class SelectStoryActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private StoriesRecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_story);

        mRecyclerView = findViewById(R.id.storiesRecyclerView);

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new StoriesRecyclerAdapter(this, ((TysApp) getApplication()).getStories());
        mRecyclerView.setAdapter(mAdapter);
    }


}
