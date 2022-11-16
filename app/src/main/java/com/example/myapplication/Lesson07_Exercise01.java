package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson07_Exercise01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson07_exercise01);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText gender = findViewById(R.id.Gender);
        Button register = findViewById(R.id.add);
        TextView nam = findViewById(R.id.Name);
        TextView Age = findViewById(R.id.Age);
        TextView Gender = findViewById(R.id.gender);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _name,_gender;
                 int _age;
                _name = (name.getText().toString().trim());
                _gender=(gender.getText().toString().trim());
                _age=Integer.parseInt(age.getText().toString().trim());
               nam.setText(_name);
                Gender.setText(_gender);

                if(_age>=25&&_age<=60) {
                   Age.setText("You are not accepted");
                }
                else {
                  Age.setText("You are accepted");
                }



            }
        });

        ImageView next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson07_Exercise01.this, Lesson07_Exercise02.class));
                finish();

            }
        });

        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson07_Exercise01.this, MainActivity.class));
                finish();
            }
        });
    }
}