package com.example.controlsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomListActivity extends AppCompatActivity {
    //1. listview
    ListView lstcars;

    //2. data
    String[] title = {"Car1","Car2","Car3","Car4","Car5"};
    String[] description = {"Car Description1",
    "Car Description2",
    "Car Description3", "Car Description4",
    "Car Description5"};
    int[] images = {R.drawable.car1,
    R.drawable.car2,
    R.drawable.car3,
    R.drawable.car4,
    R.drawable.car5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        ControlInitialization();
    }

    private void ControlInitialization()
    {
        lstcars = findViewById(R.id.lstCars);
        MyListAdapter adapter = new MyListAdapter(this,title,
                description,images);
        lstcars.setAdapter(adapter);

        lstcars.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strtitle = title[i].toString();
                Toast.makeText(getApplicationContext(),strtitle,Toast.LENGTH_SHORT).show();
            }
        });
    }


}