package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pr4 extends AppCompatActivity {
    EditText input;
    Button submit;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr4);
        input=findViewById(R.id.txtinput);
        submit=findViewById(R.id.btnshow);
        result =findViewById(R.id.lblResult);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num= Double.valueOf(input.getText().toString());
                Double p=num*2.2;
                result.setText(num+" kg = "+p+" pound");
            }
        });
    }
}