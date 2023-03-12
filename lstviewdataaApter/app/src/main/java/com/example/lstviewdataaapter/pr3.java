package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pr3 extends AppCompatActivity {

    EditText input;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr3);
        input=findViewById(R.id.txtinput);
        submit=findViewById(R.id.btnsubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Double num= Double.valueOf(input.getText().toString());
                double v = (num - 32) * 5;
                Double c=v/9;
                Toast.makeText(getApplicationContext(),num+"F ="+c+"C",Toast.LENGTH_SHORT).show();

            }
        });

    }
}