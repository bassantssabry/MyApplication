package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson10_Exercise01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10_exercise01);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        TextView rez = findViewById(R.id.rez);
        calc c=new calc();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double _num1, _num2;
                _num1 =Double.parseDouble (num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());
               rez.setText(String.valueOf(c.add(_num1,_num2)));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());

                rez.setText(String.valueOf(c.sub(_num1,_num2)));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());

                rez.setText(String.valueOf(c.mult(_num1,_num2)));


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());
                rez.setText(String.valueOf(c.div(_num1,_num2)));



            }
        });

        ImageView next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson10_Exercise01.this, Lesson10_Exercise02.class));
                finish();

            }
        });
        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson10_Exercise01.this, MainActivity.class));
                finish();
            }
        });

    }
}