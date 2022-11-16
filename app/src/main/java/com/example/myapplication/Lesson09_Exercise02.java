package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lesson09_Exercise02 extends AppCompatActivity {
    private EditText name,pass;
    private Button calc;
    private TextView nam,Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson09_exercise02);
        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        calc= findViewById(R.id.calculate);
        nam= findViewById(R.id.nam);
        Pass= findViewById(R.id.Pass);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                String names[]= new String[5], passwords[] = new String[5];
                names[0]="ahmed";
                names[1]="mohamed";
                names[2]="said";
                names[3]="hasan";
                names[4]="ayman";

                passwords[0]="1";
                passwords[1]="12";
                passwords[2]="123";
                passwords[3]="1234";
                passwords[4]="12345";





                for (int i=0; i<5;i++)
                {
                    if (name.equals( names[i]) && passwords.equals(passwords[i])){
                        names[i] =name.getText().toString().trim();
                        Log.d("Welcome ",names[i]);
                        passwords[i] =name.getText().toString().trim();
                        Log.d("Welcome " ,  passwords[i]);
                    }

                }


            }
        });
    }
}