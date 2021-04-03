package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent calendaractivityintent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(calendaractivityintent);
            }
        });
    }
}