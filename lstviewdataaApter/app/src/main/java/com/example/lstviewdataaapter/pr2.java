package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pr2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr2);
        EditText txtInput=findViewById(R.id.txtPalindrom);
        Button btnInput=findViewById(R.id.btnCheck);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num = Integer.parseInt( txtInput.getText().toString() );
                int tmp=num;
                int rem,newnum=0;
                while(tmp>0)
                {
                    rem=tmp%10;
                    newnum=rem+(newnum*10);
                    tmp=tmp/10;
                }


                //mText.setText("Welcome " +String.valueOf(newnum) );
                if(newnum==num)
                {
                    Toast.makeText(getApplicationContext(),"Your nuber is palindrome"+num,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Your nuber is not palindrome"+num,Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}