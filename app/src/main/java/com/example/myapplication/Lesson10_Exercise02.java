package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson10_Exercise02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10_exercise02);
        EditText name = findViewById(R.id.name);
        EditText salary = findViewById(R.id.salary);
        EditText taxes = findViewById(R.id.taxes);
        EditText Discount = findViewById(R.id.Discount);
        EditText Holiday = findViewById(R.id.Holiday);
        Button add = findViewById(R.id.add);
        TextView Name = findViewById(R.id.Nam);
        TextView Salary = findViewById(R.id.Salary);
        salary emp1=new salary();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _salary,_Holiday,_taxes,_Discount;
                String _name;
                _name=name.getText().toString().trim();
                _salary =Double.parseDouble (salary.getText().toString().trim());
                _taxes = Double.parseDouble(taxes.getText().toString().trim());
                _Holiday = Double.parseDouble(Holiday.getText().toString().trim());
                _Discount = Double.parseDouble(Discount.getText().toString().trim());
                Name.setText(_name);
                Salary.setText(String.valueOf(emp1.employee(_salary,_Holiday,_taxes,_Discount)));

            }
        });

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson10_Exercise02.this, Lesson10_Exercise01.class));
                finish();
            }
        });

    }
}



