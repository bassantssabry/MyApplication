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

public class Lesson07_Exercise02 extends AppCompatActivity {
    private Spinner spinner;
   private EditText weight;
   private Button  calculate_weight;
   private TextView Weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson07_exercise02);
        weight = findViewById(R.id.weight);
        spinner = findViewById(R.id.spinner);
        calculate_weight = findViewById(R.id.calculate);
        Weight  = findViewById(R.id.Weight);
        calculate_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double _weight,m;
                String planet ;
                planet=(spinner.getSelectedItem().toString().trim());
                _weight=Double.parseDouble(weight.getText().toString().trim());
                m = _weight/ 9.8;
                if (planet.equals("Mercury")) {
                    Weight.setText("Your wight on Mercury is: " + m * 3.61 + " Kg");
                } else if (planet.equals("Venus")) {
                    Weight.setText("Your wight on Venus is: " + m * 8.83 + " Kg");
                } else if (planet.equals("Mars")) {
                    Weight.setText("Your wight on Mars is: " + m * 3.75 + " Kg");
                } else if (planet.equals("Jupiter")) {
                    Weight.setText("Your wight on Jupiter is: " + m * 24.5 + " Kg");
                } else if (planet.equals("Saturn")) {
                    Weight.setText("Your wight on Saturn is: " + m * 11.2 + " Kg");
                } else if (planet.equals("Uranus")) {
                    Weight.setText ("Your wight on Uranus is: " + m * 10.5 + " Kg");
                } else if (planet.equals("Neptune")) {
                    Weight.setText("Your wight on Neptune is: " + m * 13.3 + " Kg");
                } else if (planet.equals("Pluto")) {
                    Weight.setText("Your wight on Pluto is: " + m * .61 + " Kg");
                } else {
                    Weight.setText("Sorry. I don't know your planet");
                }

            }
        });

        ImageView next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson07_Exercise02.this, Lesson07_Exercise03.class));
                finish();

            }
        });
        ImageView back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Lesson07_Exercise02.this, Lesson07_Exercise01.class));
                finish();
            }
        });


    }
}