package com.example.appdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView lblName;
    Button btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ControlInitialization();
        ButtonClicks();
        Intent objIntent = getIntent();
        String name = objIntent.getStringExtra("name");
        Toast.makeText(getApplicationContext(), name,
                Toast.LENGTH_SHORT).show();
        lblName.setText(name);

        if(ContextCompat.checkSelfPermission(this,Manifest.
                permission.CALL_PHONE)!=
        PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.CALL_PHONE}, 0);
        }

    }
    private void ButtonClicks()
    {
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Make a call
                Intent objIntent = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:12345"));
                startActivity(objIntent);*/

                /*Dial a number
                Intent objIntent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:12345"));
                startActivity(objIntent);*/

                /*Open URL in browser
                Intent objIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));
                startActivity(objIntent);*/

                /*OPen Map
                Intent objIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:21.0682849,73.1311379"));
                startActivity(objIntent);*/

                /* Contacts list
                Intent objIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people/2"));
                startActivity(objIntent);*/

                /*call logs
                Intent objIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://call_log/calls"));
                startActivity(objIntent);*/

                /*Send SMS
                Intent objIntent = new Intent(Intent.ACTION_SENDTO);
                objIntent.putExtra("sms_body","Hello..Welcome");
                objIntent.putExtra("address","9904599931");
                objIntent.setData(Uri.parse("smsto:"));
                startActivity(objIntent);*/

                //send Email
                Intent objIntent = new Intent(Intent.ACTION_SEND);
                objIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"jigna.solanki@utu.ac.in"});
                objIntent.putExtra(Intent.EXTRA_SUBJECT,"Welcome Intent Email");
                objIntent.putExtra(Intent.EXTRA_TEXT,"Hello...welcome");
                objIntent.setType("message/rfc822");
                startActivity(objIntent);
            }
        });
    }
    private void ControlInitialization()
    {

        lblName = findViewById(R.id.lblName);
        btnCall = findViewById(R.id.btnCall);
    }



}