package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Lesson07_Exercise03 extends AppCompatActivity {
    private Spinner spinner;
    private EditText name,salary;
    private Button calculate;
    private TextView Name,Salary,position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson07_exercise03);
       name = findViewById(R.id.name);
        salary=findViewById(R.id.salary);
        spinner = findViewById(R.id.spinner);
        calculate = findViewById(R.id.calculate);
        Name  = findViewById(R.id.Name);
        Salary=findViewById(R.id.Salary);
        position=findViewById(R.id.position);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _salary;
                String planet,_name ;
                planet=(spinner.getSelectedItem().toString().trim());
                _name=(name.getText().toString().trim());
                _salary=Double.parseDouble(salary.getText().toString().trim());


                if(_salary <2000)
                    Salary.setText(" حسبنا الله و نعم الوكيل😠😠😠  \n");
                else {
                   Name .setText( _name );
                    if(planet.equals("manager "))
                       position.setText( "  ( manager  )  " +"New salary = "+(_salary-(_salary*20/100)));
                    else if(planet.equals("Employee"))
                       position.setText( "  ( Employee )  " +"New salary = "+(_salary-(_salary*14/100)));
                    else if(planet.equals("worker"))
                        position.setText( "  ( worker   )  " +"New salary = "+(_salary-(_salary*12/100)));
                }
            }
        });
        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson07_Exercise03.this, Lesson07_Exercise02.class));
                finish();
            }
        });

    }
}