package com.example.appdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnNavigate;
    EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate","Activity Created");
     //   Toast.makeText(getApplicationContext(), "Activity Created", Toast.LENGTH_SHORT).show();

        ControlInitialization();
        ButtonClicks();

    }

    private void ControlInitialization()
    {
        btnNavigate = findViewById(R.id.btnNavigate);
        txtName = findViewById(R.id.txtName);
    }

    private void ButtonClicks()
    {
        btnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Button is clicked",Toast.LENGTH_SHORT).show();
                Intent objIntent = new Intent(getApplicationContext(),
                        SecondActivity.class);
                objIntent.putExtra("name","Hello..welcome");
                objIntent.putExtra("name1",txtName.getText().toString());
                startActivity(objIntent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","Activity Started");
 //       Toast.makeText(getApplicationContext(), "Activity Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","Activity Resumed");
   //     Toast.makeText(getApplicationContext(), "Activity Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","Activity Paused");
       // Toast.makeText(getApplicationContext(), "Activity Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","Activity Stopped");
        //Toast.makeText(getApplicationContext(), "Activity Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","Activity Restarted");
        //Toast.makeText(getApplicationContext(), "Activity Restarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","Activity Destroyed");
        //Toast.makeText(getApplicationContext(), "Activity Destroyed", Toast.LENGTH_SHORT).show();
    }
}