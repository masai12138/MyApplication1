package com.example.masai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "hello world");
        Log.i("MainActivity", "I'm feature");
        Log.i("MainActivity", "I'm feature login fixed");
        Log.i("MainActivity", "I'm feature register");
    }
}
