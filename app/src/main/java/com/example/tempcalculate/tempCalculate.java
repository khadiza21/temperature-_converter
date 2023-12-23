package com.example.tempcalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tempCalculate extends AppCompatActivity {

    private Button cToF,FToc,btnback;
    private TextView result;
    private EditText enterTemp;
    double result1;
    double result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_calculate);


        //referencing
        cToF = findViewById(R.id.cToF);
        FToc = findViewById(R.id.FToC);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);
        btnback = findViewById(R.id.backButton);


        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(enterTemp.getText().toString());
                result1 = (temp * 1.8) + 32;
//                result.setText(String.valueOf(result1));
                result.setText(String.format("%.3f", result1) + " Fahrenheit");


            }
        });

        FToc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result2 = (temp - 32) * (5.0/9.0);
                result.setText(String.format("%.3f", result2) + " Celsius");

            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ok Button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(tempCalculate.this, "Redirecting..", Toast.LENGTH_SHORT).show();


            }
        });
    }
}