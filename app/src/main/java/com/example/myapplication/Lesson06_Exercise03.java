package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson06_Exercise03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson06_exercise03);
        EditText yearbirth = findViewById(R.id.yearbirth);
        EditText monthbrith = findViewById(R.id.monthbrith);
        EditText daybirth= findViewById(R.id.daybirth);
        EditText year = findViewById(R.id.year);
        EditText month = findViewById(R.id.month);
        EditText day = findViewById(R.id.day);
        Button calculate_your_age = findViewById(R.id.calculate);
        TextView Year = findViewById(R.id.Year);
        TextView Month = findViewById(R.id.Month);
        TextView Day = findViewById(R.id.Day);

        calculate_your_age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yearb,manthb,dayb,Yeart,Montht,dayt;
                yearb=Integer.parseInt(yearbirth.getText().toString().trim());
                manthb=Integer.parseInt(monthbrith.getText().toString().trim());
                dayb=Integer.parseInt(daybirth.getText().toString().trim());
                Yeart=Integer.parseInt(year.getText().toString().trim());
                Montht=Integer.parseInt(month.getText().toString().trim());
                dayt=Integer.parseInt(day.getText().toString().trim());

                int calculated_date =  dayt -  dayb;
               int calculated_month = Montht - manthb;
               int calculated_year = Yeart - yearb;

                if(0>calculated_month){
                    calculated_year--;
                    calculated_month =calculated_month+12;
                }
                if (0 > calculated_date) {
                    calculated_month --;
                    calculated_date= calculated_date + 30;
                }
                Year.setText(String.valueOf(calculated_year));
                Month.setText(String.valueOf(calculated_month));
                Day.setText(String.valueOf(calculated_date));

            }
        });
        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson06_Exercise03.this, Lesson06_Exercise02.class));
                finish();
            }
        });
    }
}