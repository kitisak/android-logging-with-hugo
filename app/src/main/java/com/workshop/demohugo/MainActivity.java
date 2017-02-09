package com.workshop.demohugo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hugo.weaving.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayHi("Somkiat");
    }

    @DebugLog
    private String sayHi(String name) {
        return String.format("Hi %s", name);
    }
}
