package com.example.shakkhor.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Add_Drug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__drug);
        Toast.makeText(Add_Drug.this, "Add Drug Activity", Toast.LENGTH_LONG).show();
    }
}
