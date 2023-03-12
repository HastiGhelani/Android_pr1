package com.example.controlsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateActivity extends AppCompatActivity {
    TextView lblDate;
    Button btnDate, btnTime;
    DatePicker datePicker;
    TimePicker timePicker;
    int mYear, mMonth, mDate, mHour, mMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        ControlInitialization();
        lblDate.setText("Current Time is : " + GetCurrentTime());
        ButtonClicks();
    }

    private String GetCurrentDate()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(datePicker.getDayOfMonth() + "/");
        sb.append((datePicker.getMonth() + 1) + "/");
        sb.append(datePicker.getYear());

        return sb.toString();
    }

    private String GetCurrentTime()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(timePicker.getCurrentHour() + ":");
        sb.append(timePicker.getCurrentMinute());
        return sb.toString();
    }
    private void ControlInitialization()
    {
        lblDate = findViewById(R.id.lblDate);
        btnDate = findViewById(R.id.btnGetDate);
        datePicker = findViewById(R.id.datepicker);
        timePicker = findViewById(R.id.timepicker);
        btnTime = findViewById(R.id.btnGetTime);
    }

    private void ButtonClicks()
    {
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // lblDate.setText("Changed Time is :" + GetCurrentTime());

                Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR);
                mMinute = c.get(Calendar.MINUTE);

                TimePickerDialog dialog = new TimePickerDialog(DateActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        String am_pm = (hour < 12)?"AM" : "PM";
                        lblDate.setText("Selected Time is : " + hour + ":" + minute + " " + am_pm);
                    }
                },mHour,mMinute,false);

                dialog.show();

            }
        });
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // lblDate.setText("Changed Date is : " + GetCurrentDate());

                Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDate = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(DateActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        lblDate.setText("Selected date is : " + day + "/" +
                                (month+1) + "/" + year);
                    }
                },mYear,mMonth,mDate);

                dialog.show();
            }
        });
    }
}