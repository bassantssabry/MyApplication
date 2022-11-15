package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson06_Exercise01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson06_exercise01);
        EditText f_name = findViewById(R.id.F_name);
        EditText l_name = findViewById(R.id.L_name);
        EditText gender = findViewById(R.id.Gender);
        Button register = findViewById(R.id.add);
        TextView nam1 = findViewById(R.id.f_name);
        TextView nam2 = findViewById(R.id.l_name);
        TextView Gender = findViewById(R.id.gender);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String _f_name, _l_name,_gender;

                _f_name = (f_name.getText().toString().trim());
                _l_name =(l_name.getText().toString().trim());
                _gender=(gender.getText().toString().trim());

                nam1.setText(_f_name);
                nam2.setText(_l_name);
                Gender.setText(_gender);

            }
        });
        ImageView next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson06_Exercise01.this, Lesson06_Exercise02.class));
                finish();
            }
        });


    }



}