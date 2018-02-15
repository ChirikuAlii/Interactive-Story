package com.example.chirikualii.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.chirikualii.interactivestory.R;

public class StoryActivity extends AppCompatActivity {

    public static String TAG = StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.KEY_NAME);
        if (name==null || name.isEmpty()){
            name = "friend";
        }

        Log.d(TAG,name);
    }
}
