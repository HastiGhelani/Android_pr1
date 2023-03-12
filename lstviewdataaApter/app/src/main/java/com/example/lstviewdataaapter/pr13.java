package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class pr13 extends AppCompatActivity {
    Button cal;
    EditText lblyear,lbldays;
    TextView lblresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr13);
        cal = findViewById(R.id.btnCalculate);
        lblyear = findViewById(R.id.txtYear);
        lbldays = findViewById(R.id.txtDays);
        lblresult = findViewById(R.id.lblResult);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = Integer.parseInt(lblyear.getText().toString());
                int days = Integer.parseInt(lbldays.getText().toString());

                if (days > 0 && days <= 365) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(Calendar.YEAR, year);
                    calendar.set(Calendar.DAY_OF_YEAR, days);
                    int month = calendar.get(Calendar.MONTH) + 1;
                    int day = calendar.get(Calendar.DAY_OF_MONTH);
                    String result = String.format("Date of year: %d/%d/%d", day, month, year);
                    lblresult.setText(result);
                } else {
                    lblresult.setText("Invalid input! Number of days must be between 1 and 365.");
                }
            }
        });

    }
}