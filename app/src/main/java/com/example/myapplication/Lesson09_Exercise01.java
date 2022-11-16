package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson09_Exercise01 extends AppCompatActivity {
    private EditText name;
    private Button calc;
    private TextView nam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson09_exercise01);
        name = findViewById(R.id.name);
        calc= findViewById(R.id.calculate);
        nam= findViewById(R.id.nam);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] arr;
                arr= new String [4];
                for(int i=0;i<4;i++){
                    nam.setText("Enter student  name "+(i+1)+" : ");
                    arr[i]=name.getText().toString().trim();
                }

                for( int i=0;i<4;i++){

                   nam.setText(" student   "+(i+1)+" is "+arr[i]);
                }
            }
        });
        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson09_Exercise01.this, MainActivity.class));
                finish();
            }
        });

        ImageView next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson09_Exercise01.this, Lesson09_Exercise02.class));
                finish();

            }
        });



    }
}