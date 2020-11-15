package com.example.a5labmd_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        long startTime = System.nanoTime();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Вызван onCreate()", Toast.LENGTH_SHORT).show();
        long endTime = System.nanoTime();
        System.out.println("onCreate took " + (endTime - startTime) + " milliseconds");
    }
    @Override protected void onStart() {
        long startTime = System.nanoTime();
        super.onStart();
        Toast.makeText(this, "Вызван onStart()", Toast.LENGTH_SHORT).show();
        long endTime = System.nanoTime();
        System.out.println("onStart took " + (endTime - startTime) + " milliseconds");
    }

    @Override protected void onPause() {
        long startTime = System.nanoTime();
        Toast.makeText(this, "Вызван onPause()", Toast.LENGTH_SHORT).show();
        super.onPause();
        long endTime = System.nanoTime();
        System.out.println("onPause took " + (endTime - startTime) + " milliseconds");
    }

    @Override protected void onResume() {
        long startTime = System.nanoTime();
        super.onResume();
        Toast.makeText(this, "Вызван onResume()", Toast.LENGTH_SHORT).show();
        long endTime = System.nanoTime();
        System.out.println("onResume took " + (endTime - startTime) + " milliseconds");
    }

    @Override protected void onStop() {
        long startTime = System.nanoTime();
        Toast.makeText(this, "Вызван onStop()", Toast.LENGTH_SHORT).show();
        super.onStop();
        long endTime = System.nanoTime();
        System.out.println("onStop took " + (endTime - startTime) + " milliseconds");
    }

    @Override protected void onDestroy() {
        long startTime = System.nanoTime();
        Toast.makeText(this, "Вызван onDestroy()", Toast.LENGTH_SHORT).show();
        super.onDestroy();
        long endTime = System.nanoTime();
        System.out.println("onDestroy took " + (endTime - startTime) + " milliseconds");
    }
}