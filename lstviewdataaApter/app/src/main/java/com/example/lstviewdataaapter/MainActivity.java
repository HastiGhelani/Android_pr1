package com.example.lstviewdataaapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//data adapter and list view

    String[] courses; //={"Int MSc","BSc","BCA","MCA"};
    ListView lstcource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstcource = findViewById(R.id.lstcource);
       // Toast.makeText(getApplicationContext(), courses.length + "", Toast.LENGTH_SHORT).show();
        String[] courses = getResources().getStringArray(R.array.courses);
        ArrayAdapter ad = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,courses);
        lstcource.setAdapter(ad);

        lstcource.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position)
                {
                    case 0:
                        //activity 1
                        startActivity(new Intent(getApplicationContext(), pr1.class));
                        break;

                    case 1:
                        //activity 2
                        startActivity(new Intent(getApplicationContext(), pr13.class));
                        break;

                    case 2:
                        //activity 3
                        startActivity(new Intent(getApplicationContext(), pr2.class));
                        break;

                    case 3:
                        //activity 4
                        startActivity(new Intent(getApplicationContext(), pr3.class));
                        break;

                    case 4:
                        //activity 5
                        startActivity(new Intent(getApplicationContext(), pr4.class));
                        break;
                    case 5:
                        //activity 6
                        startActivity(new Intent(getApplicationContext(), pr5.class));
                        break;
                    case 6:
                        //activity 7
                        startActivity(new Intent(getApplicationContext(), pr6.class));
                        break;

                    case 7:
                        //activity 8
                        startActivity(new Intent(getApplicationContext(), pr7.class));
                        break;

                    case 8:
                        //activity 9
                        startActivity(new Intent(getApplicationContext(), pr8.class));
                        break;

                    case 9:
                        //activity 10
                        startActivity(new Intent(getApplicationContext(), pr9.class));
                        break;

                    case 10:
                        //activity 11
                        startActivity(new Intent(getApplicationContext(), pr10.class));
                        break;

                    case 11:
                        //activity 12
                        startActivity(new Intent(getApplicationContext(), pr11.class));
                        break;

                    case 12:
                        //activity 13
                        startActivity(new Intent(getApplicationContext(), pr12.class));
                        break;
                }
                String selectedItem = ad.getItem(position).toString();
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }


}