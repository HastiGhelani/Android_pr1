package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pr1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr1);
        Button btn = findViewById(R.id.btnokay);
        TextView lblShow = findViewById(R.id.txtmsg);
        EditText txtInput = findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    lblShow.setText(txtInput.getText().toString());
            }
        });
    }
}