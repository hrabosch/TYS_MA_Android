package com.hrabosch.tellyourstory.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hrabosch.tellyourstory.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button continueButton = findViewById(R.id.btnContinue);
        continueButton.setClickable(false);
        continueButton.setBackgroundColor(0xFFA0A0A0);
    }


    public void startNewStory(View view) {
        Intent intent = new Intent(this, SelectStoryActivity.class);
        startActivity(intent);
    }
}
