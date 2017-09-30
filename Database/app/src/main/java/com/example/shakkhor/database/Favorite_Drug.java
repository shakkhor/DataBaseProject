package com.example.shakkhor.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Favorite_Drug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite__drug);
        Toast.makeText(Favorite_Drug.this, "Favorite Drug Activity", Toast.LENGTH_LONG).show();
    }
}
