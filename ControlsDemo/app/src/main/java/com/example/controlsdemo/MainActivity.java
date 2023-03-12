package com.example.controlsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView lblDate;
    Button btnGetDate;
    DatePicker datePicker;
    int mYear, mMonth, mDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ControlInitialization();
     //   lblDate.setText("Current date is : " + getCurrentDate());
        ButtonClicks();
    }


    private String getCurrentDate()
    {
        StringBuilder sb = new StringBuilder();
        sb.append( datePicker.getDayOfMonth() + "/");
        sb.append(datePicker.getMonth() + 1 + "/");
        sb.append(datePicker.getYear());
        return sb.toString();


    }
    private void ControlInitialization()
    {
        lblDate = findViewById(R.id.lblDate);
        btnGetDate = findViewById(R.id.btnGetDate);
        //datePicker = findViewById(R.id.datepicker);
    }

    private void ButtonClicks()
    {
        btnGetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // lblDate.setText("Changed date is: " + getCurrentDate());
                Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDate = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                        lblDate.setText("Selected Date is : " + date + "/" + (month + 1) +
                                "/" + year);
                    }
                },mYear,mMonth,mDate);

                dialog.show();

            }
        });
    }
}