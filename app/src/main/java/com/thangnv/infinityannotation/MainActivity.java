package com.thangnv.infinityannotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thangnv.annotations.Infinity;

@Infinity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}