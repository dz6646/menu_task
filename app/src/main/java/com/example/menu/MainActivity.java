package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout myLayout;
    Intent si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout = findViewById(R.id.myLayout);
        si = new Intent(this, secondActivity.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String color = item.getTitle().toString();
        if(color.equals("Red"))
        {
            myLayout.setBackgroundColor(Color.RED);
        }
        else if(color.equals("Blue"))
        {
            myLayout.setBackgroundColor(Color.BLUE);
        }
        else
        {
            myLayout.setBackgroundColor(Color.GREEN);
        }
        return true;
    }

    public void passActivity(View view) {
        startActivity(si);
    }
}