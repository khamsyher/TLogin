package com.example.tlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create varrible
        Toolbar toolbar = (Toolbar) findViewById(R.id.tbmain);
        setSupportActionBar(toolbar);
        Intent ig = getIntent();
        String User = ig.getStringExtra("username");
        getSupportActionBar().setTitle(User);
    }
}