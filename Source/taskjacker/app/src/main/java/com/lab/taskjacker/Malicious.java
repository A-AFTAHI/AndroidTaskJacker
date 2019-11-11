package com.lab.taskjacker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Malicious extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("target");
        setContentView(R.layout.activity_malicious);
        moveTaskToBack(true);
    }
}
