package com.example.toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Toolbar");

        }
        Objects.requireNonNull(getSupportActionBar()).setSubtitle("Nasir");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid= item.getItemId();
        if (itemid==R.id.option1)
        {
            Toast.makeText(this, "Create New File", Toast.LENGTH_SHORT).show();
        }
      else if (itemid==R.id.option2)
        {
            Toast.makeText(this, "Save New File", Toast.LENGTH_SHORT).show();
        }
        else if (itemid==android.R.id.home)
        {
            super.getOnBackPressedDispatcher();
        }
        else {
            Toast.makeText(this, "Upload New File", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}