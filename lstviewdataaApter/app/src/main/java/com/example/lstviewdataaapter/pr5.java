package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pr5 extends AppCompatActivity {
    EditText number1Input, number2Input;
    TextView resultText;
    Button plusButton, minusButton, multiplyButton, divideButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr5);

        number1Input = findViewById(R.id.number1_input);
        number2Input = findViewById(R.id.number2_input);
        resultText = findViewById(R.id.result_text);
        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1= Double.valueOf(number1Input.getText().toString());
                Double num2= Double.valueOf(number2Input.getText().toString());
                Double ans =num1+num2;
                resultText.setText(String.valueOf(ans));
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1= Double.valueOf(number1Input.getText().toString());
                Double num2= Double.valueOf(number2Input.getText().toString());
                Double ans =num1-num2;
                resultText.setText(String.valueOf(ans));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1= Double.valueOf(number1Input.getText().toString());
                Double num2= Double.valueOf(number2Input.getText().toString());
                Double ans =num1*num2;
                resultText.setText(String.valueOf(ans));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1= Double.valueOf(number1Input.getText().toString());
                Double num2= Double.valueOf(number2Input.getText().toString());
                Double ans =num1/num2;
                resultText.setText(String.valueOf(ans));
            }
        });
    }
}