package com.example.controlsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Car> carList = new ArrayList<>();
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ControlInitialization();
    }

    private void ControlInitialization()
    {
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new MyAdapter(carList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        InsertData();
    }

    private void InsertData() {
        Car car = new Car("Car1","Car Description1",R.drawable.car1,
                100000);
        carList.add(car);

        car = new Car("Car2","Car Description2",R.drawable.car2,300000);
        carList.add(car);

        car = new Car("Car3","Car Description3",R.drawable.car3,400000);
        carList.add(car);

        car = new Car("Car4","Car Description4",R.drawable.car4,500000);
        carList.add(car);

        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);

        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);
        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);

        car = new Car("Car5","Car Description5",R.drawable.car5,600000);
        carList.add(car);

    }
}