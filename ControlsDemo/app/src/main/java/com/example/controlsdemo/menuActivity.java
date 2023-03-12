package com.example.controlsdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class menuActivity extends AppCompatActivity {
    ListView lstCities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ControlInitialization();

        BindListView();
        //register context menu on listview
        registerForContextMenu(lstCities);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.contactus:
                Toast.makeText(getApplicationContext(), "contact us clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.call)
        {
            Toast.makeText(getApplicationContext(), "Call is clicked",
                    Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.SMS)
        {
            Toast.makeText(getApplicationContext(), "SMS is clicked",
                    Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }

    private void BindListView()
    {
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.cities));
        lstCities.setAdapter(adapter);
    }
    private void ControlInitialization()
    {

        lstCities = findViewById(R.id.lstCities);
    }


}