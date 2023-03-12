package com.example.controlsdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {
    Button btnShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ControlInitialization();
        ButtonClicks();
    }

    private void ControlInitialization()
    {

        btnShowDialog = findViewById(R.id.btnShowDialog);
    }

    private void ButtonClicks()
    {
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   AlertDialog.Builder builder = new AlertDialog.Builder(
                        DialogActivity.this);
                builder.setMessage("Do you want to close this Application?");
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setTitle("Alert Dialog Example");
                builder.setCancelable(false);

                AlertDialog dialog = builder.create();
                dialog.show();*/


                AlertDialog.Builder builder = new AlertDialog.Builder(
                        DialogActivity.this);

                View customview = getLayoutInflater().inflate(R.layout.custview,null);
                builder.setView(customview);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText txtEmail = customview.findViewById(R.id.txtEmail);
                        sendDate(txtEmail.getText().toString());
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    private void sendDate(String data)
    {
        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
    }

}