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

public class ControlsActivity extends AppCompatActivity {
    ListView lstCities;
    Spinner ddlCities;
    String[] cities;//{"Surat","Navsari","Valsad"};
    RadioButton rbMale, rbFemale;
    RadioGroup rgGender;
    Button btnDisplay;
    CheckBox chkCondition;
    ArrayAdapter adapter;
    AutoCompleteTextView actCities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);
        ControlInitialization();
        ButtonClicks();
        BindListView();

        BindAutoCompleteTextView();

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
                switch (i) {
                    case R.id.rbMale:
                        Toast.makeText(getApplicationContext(), rbMale.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbFemale:
                        Toast.makeText(getApplicationContext(), rbFemale.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                }
              /*  if(i == R.id.rbMale)
                {
                    Toast.makeText(getApplicationContext(), rbMale.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), rbFemale.getText().toString(), Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
    public void mybuttonclick(View view)
    {
        Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_SHORT).show();
    }
    private void BindAutoCompleteTextView()
    {
        cities = getResources().getStringArray(R.array.cities);
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,
                cities);
        actCities.setThreshold(2);
        actCities.setAdapter(adapter);
    }
    private void ControlInitialization()
    {
        lstCities = findViewById(R.id.lstCities);
        ddlCities = findViewById(R.id.ddlCities);
        rbMale = findViewById(R.id.rbMale);
        rbFemale =findViewById(R.id.rbFemale);
        btnDisplay = findViewById(R.id.btnDisplay);
        chkCondition = findViewById(R.id.chkCondition);
        actCities = findViewById(R.id.actCities);
        rgGender = findViewById(R.id.rgGender);
    }

    private void ButtonClicks()
    {
     /*   btnDisplay.setOnClickListener(new View.OnClickListener() {
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
    }
    private void BindListView()
    {
        cities = getResources().getStringArray(R.array.cities);
        adapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1,cities);
        lstCities.setAdapter(adapter);


        lstCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position,
                                    long l) {
                String SelectedItem = adapter.getItem(position).toString();

                Toast.makeText(getApplicationContext(), SelectedItem, Toast.LENGTH_SHORT).show();
            }
        });

        ddlCities.setAdapter(adapter);
        ddlCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String SelectedItem = adapterView.getItemAtPosition(position).toString();
                 //adapter.getItem(position);
              //  cities[position].toString();
                Toast.makeText(getApplicationContext(),SelectedItem,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}