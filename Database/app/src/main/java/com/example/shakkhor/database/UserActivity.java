package com.example.shakkhor.database;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class UserActivity extends AppCompatActivity  {

    private static ImageButton Search, Indication, Vcard, Class, News, FavoriteDrug, AddDrug, Prescription, Job;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);

        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
        setOnClick();
    }

    private void setOnClick(){
        Search = (ImageButton)findViewById(R.id.imageButton_search);
        Indication = (ImageButton)findViewById(R.id.imageButton_indication);
        Vcard = (ImageButton)findViewById(R.id.imageButton_visitingCard);
        Class = (ImageButton)findViewById(R.id.imageButton_class);
        News = (ImageButton)findViewById(R.id.imageButton_news);
        FavoriteDrug = (ImageButton)findViewById(R.id.imageButton_favoriteDrug);
        AddDrug = (ImageButton)findViewById(R.id.imageButton_addDrug);
        Prescription = (ImageButton)findViewById(R.id.imageButton_prescription);
        Job = (ImageButton)findViewById(R.id.imageButton_job);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Search.class);
                startActivity(intent);
            }
        });
        Indication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Drug_By_Indication.class);
                startActivity(intent);
            }
        });
        Vcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, My_Visiting_Card.class);
                startActivity(intent);
            }
        });
        Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Drug_By_Class.class);
                startActivity(intent);
            }
        });
        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Medical_News.class);
                startActivity(intent);
            }
        });
        FavoriteDrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Favorite_Drug.class);
                startActivity(intent);
            }
        });
        AddDrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Add_Drug.class);
                startActivity(intent);
            }
        });
        Prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Mini_Prescription.class);
                startActivity(intent);
            }
        });
        Job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, Job.class);
                startActivity(intent);
            }
        });
    }

}
