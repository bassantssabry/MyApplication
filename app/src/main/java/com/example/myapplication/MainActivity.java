package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button variables,if_condition,array_loop,functions,Class_Object,Encapsulate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        variables=findViewById(R.id.va);
        if_condition=findViewById(R.id.if_con);
        array_loop=findViewById(R.id.array);
        functions=findViewById(R.id.fun);
        variables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lesson06_Exercise01.class));
                finish();
            }
        });
        if_condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lesson07_Exercise01.class));
                finish();
            }
        });
        array_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lesson09_Exercise01.class));
                finish();

            }
        });
        functions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lesson10_Exercise01.class));
                finish();

            }
        });
    }
}