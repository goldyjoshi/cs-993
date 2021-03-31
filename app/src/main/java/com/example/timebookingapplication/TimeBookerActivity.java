package com.example.timebookingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class TimeBookerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_booker);
        Button bookTimeProject = findViewById(R.id.addSubmitTimeBtn);
        bookTimeProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimeBookerActivity.this, BookTimeActivity.class);
                startActivity(intent);
            }
        });

        Button setReminder = findViewById(R.id.buttonSetReminder);
        setReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimeBookerActivity.this, SetReminderActivity.class);
                startActivity(intent);
            }
        });
    }
}