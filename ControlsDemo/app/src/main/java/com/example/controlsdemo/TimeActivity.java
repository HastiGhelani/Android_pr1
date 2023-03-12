package com.example.controlsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimeActivity extends AppCompatActivity {
    TextView lblTime;
    Button btnTime;
    TimePicker timePicker;
    int mHour, mMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        ControlInitialization();
      //  lblTime.setText("Current Time is :" + GetCurrentTime());
        ButtonClicks();
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
        lblTime = findViewById(R.id.lblTime);
        btnTime = findViewById(R.id.btnTime);
    //    timePicker = findViewById(R.id.timepicker);
    }

    private void ButtonClicks()
    {
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  lblTime.setText("Changed time is :" + GetCurrentTime());
                Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR);
                mMinute = c.get(Calendar.MINUTE);
                TimePickerDialog dialog = new TimePickerDialog(TimeActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        String am_pm = (hour<12)? "AM" : "PM";
                        lblTime.setText("Changed Time is :" + hour + ":" + minute + " " + am_pm);
                    }
                },mHour,mMinute,false);

                dialog.show();
            }
        });
    }
}