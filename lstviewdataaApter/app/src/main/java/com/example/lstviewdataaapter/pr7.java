package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pr7 extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button add,sub,mul,div,del,res;
    EditText str;
    private double operand1 = Double.NaN;
    private double operand2;
    private char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr7);
        /*
        btn0=findViewById(R.id.button_0);
        btn1=findViewById(R.id.button_1);
        btn2=findViewById(R.id.button_2);
        btn3=findViewById(R.id.button_3);
        btn4=findViewById(R.id.button_4);
        btn5=findViewById(R.id.button_5);
        btn6=findViewById(R.id.button_6);
        btn7=findViewById(R.id.button_7);
        btn8=findViewById(R.id.button_8);
        btn9=findViewById(R.id.button_9);
        add=findViewById(R.id.button_add);
        sub=findViewById(R.id.button_subtract);
        mul=findViewById(R.id.button_multiply);
        div=findViewById(R.id.button_division);
        del=findViewById(R.id.button_delete);
        res=findViewById(R.id.button_show);
        str=findViewById(R.id.cal);
        */
        str=findViewById(R.id.cal);
        // Set the onClickListener for all the number buttons
        findViewById(R.id.button_0).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_1).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_2).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_3).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_4).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_5).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_6).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_7).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_8).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_9).setOnClickListener(buttonClickListener);

        // Set the onClickListener for all the operator buttons
        findViewById(R.id.button_add).setOnClickListener(operatorClickListener);
        findViewById(R.id.button_subtract).setOnClickListener(operatorClickListener);
        findViewById(R.id.button_multiply).setOnClickListener(operatorClickListener);
        findViewById(R.id.button_division).setOnClickListener(operatorClickListener);

        // Set the onClickListener for the equals button
        findViewById(R.id.button_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Double.isNaN(operand1)) {
                    operand2 = Double.parseDouble(str.getText().toString());

                    switch (operator) {
                        case '+':
                            operand1 += operand2;
                            break;
                        case '-':
                            operand1 -= operand2;
                            break;
                        case '*':
                            operand1 *= operand2;
                            break;
                        case '/':
                            operand1 /= operand2;
                            break;
                    }

                    str.setText(String.valueOf(operand1));
                    operand2 = Double.NaN;
                    operator = ' ';
                }
            }
        });

        // Set the onClickListener for the delete button
        findViewById(R.id.button_delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = str.getText().toString();
                if (!currentText.isEmpty()) {
                    str.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });
    }

    // OnClickListener for all the number buttons
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String buttonValue = ((Button) v).getText().toString();
            str.setText(str.getText().toString() + buttonValue);
        }
    };

    // OnClickListener for all the operator buttons
    private View.OnClickListener operatorClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (!str.getText().toString().isEmpty()) {
                operand1 = Double.parseDouble(str.getText().toString());
                operator = ((Button) v).getText().charAt(0);
                str.setText("");
            }
        }
    };







}