package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class secondActivity extends AppCompatActivity {
    ConstraintLayout myLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myLayout = findViewById(R.id.myLayout2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 400, "Black");
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
        else if(color.equals("Green"))
        {
            myLayout.setBackgroundColor(Color.GREEN);
        }
        else
        {
            myLayout.setBackgroundColor(Color.BLACK);
        }
        return true;
    }

    public void goBack(View view) {
        finish();
    }
}