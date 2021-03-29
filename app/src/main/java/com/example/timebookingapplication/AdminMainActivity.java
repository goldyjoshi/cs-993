package com.example.timebookingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class AdminMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        RadioButton assign = findViewById(R.id.radioButtonAssignTask);
        assign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, AssignActivity.class);
                startActivity(intent);
            }
        });

        RadioButton assignTask = findViewById(R.id.radioButtonAssignP);
        assignTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, AssignActivity.class);
                startActivity(intent);
            }
        });

        RadioButton viewProject = findViewById(R.id.radioButtonViewP);
        viewProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, ViewProjectActivity.class);
                startActivity(intent);
            }
        });

        RadioButton viewTask = findViewById(R.id.radioButtonViewT);
        viewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, ViewProjectActivity.class);
                startActivity(intent);
            }
        });

        RadioButton addProject = findViewById(R.id.rBProject1);
        addProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, AddProjectActivity.class);
                startActivity(intent);
            }
        });

        RadioButton addTask = findViewById(R.id.addRbtask2);
        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, AddProjectActivity.class);
                startActivity(intent);
            }
        });

        RadioButton removeProject = findViewById(R.id.radioButtonRemoveP);
        removeProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, RemoveProjectActivity.class);
                startActivity(intent);
            }
        });

        RadioButton removeTask = findViewById(R.id.radioButtonRemoveT);
        removeTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, RemoveProjectActivity.class);
                startActivity(intent);
            }
        });




    }
}