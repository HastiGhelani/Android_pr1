package com.example.appdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class DisaplayActivity extends AppCompatActivity {
    //String[] courses;// = {"Integrated M.Sc (IT)","B.Sc (IT)","BCA","MCA","Physiotheraphy"};
    ListView lstCourses;
    Spinner ddlCourse;
    RadioButton rbMale, rbFemale;
    Button btnDisplay;
    CheckBox chkCondition;
    RadioGroup rgGender;
    AutoCompleteTextView actCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaplay);

        ControlInitialization();
       // Toast.makeText(this, courses.length + "", Toast.LENGTH_SHORT).show();
        String[] courses = getResources().getStringArray(R.array.courses);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,courses);

        actCourse.setThreshold(2);
        actCourse.setAdapter(adapter);
        ddlCourse.setAdapter(adapter);

        ddlCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();

                //adapter.getItem(i).toString();
                //courses[i].toString();

                Toast.makeText(getApplicationContext(),selectedItem,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        lstCourses.setAdapter(adapter);

        lstCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position,
                                    long l) {
                String selectedItem = adapter.getItem(position).toString();
                Toast.makeText(getApplicationContext(),selectedItem,Toast.LENGTH_SHORT).show();
            }
        });

       /* btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbMale.isChecked())
                {
                    Toast.makeText(getApplicationContext(),
                            rbMale.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            rbFemale.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });*/



        chkCondition.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true)
                {
                    btnDisplay.setVisibility(View.VISIBLE);
                }
                else
                {
                    btnDisplay.setVisibility(View.INVISIBLE);
                }
            }
        });

        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch(i)
                {
                    case R.id.rbMale:
                        Toast.makeText(getApplicationContext(),rbMale.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbFemale:
                        Toast.makeText(getApplicationContext(),rbFemale.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                }
               /* if(i == R.id.rbMale)
                {
                    Toast.makeText(getApplicationContext(),rbMale.getText().toString(),Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),rbFemale.getText().toString(),Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
    public void myclick(View view)
    {
        Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_SHORT).show();
    }
    private void ControlInitialization()
    {
        lstCourses = findViewById(R.id.lstCourses);
        ddlCourse = findViewById(R.id.ddlCourse);
        rbFemale = findViewById(R.id.rbFemale);
        rbMale = findViewById(R.id.rbMale);
        btnDisplay = findViewById(R.id.btnDisplay);
        chkCondition = findViewById(R.id.chkCondition);
        rgGender = findViewById(R.id.rgGender);
        actCourse = findViewById(R.id.actCourse);
     }
}