package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson06_Exercise02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson06_exercise02);
        EditText f_name = findViewById(R.id.F_name);
        EditText l_name = findViewById(R.id.L_name);
        EditText age = findViewById(R.id.Age);
        EditText gender = findViewById(R.id.Gender);
        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        Button register = findViewById(R.id.add);
        TextView nam1 = findViewById(R.id.f_name);
        TextView nam2 = findViewById(R.id.l_name);
        TextView Age = findViewById(R.id.age);
        TextView Gender = findViewById(R.id.gender);
        TextView Height = findViewById(R.id.hei);
        TextView Weight = findViewById(R.id.wei);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _f_name, _l_name,_gender;
                double _height,_weight,_age;

                _f_name = (f_name.getText().toString().trim());
                _l_name =(l_name.getText().toString().trim());
                _gender=(gender.getText().toString().trim());
                _height=Double.parseDouble(height.getText().toString().trim());
                _weight=Double.parseDouble(weight.getText().toString().trim());
                _age=Double.parseDouble(age.getText().toString().trim());
                nam1.setText(_f_name);
                nam2.setText(_l_name);
                Gender.setText(_gender);
               Height.setText(String.valueOf(_height));
                Weight.setText(String.valueOf(_weight));
                Age.setText(String.valueOf(_age));

            }
        });
        ImageView next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson06_Exercise02.this, Lesson06_Exercise03.class));
                finish();

            }
        });
    }
}