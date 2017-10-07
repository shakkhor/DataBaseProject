package com.example.shakkhor.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Drug_By_Indication extends AppCompatActivity {


    Toolbar toolbar;
    MakeDatabase helper = new MakeDatabase(this);
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> indications;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug__by__indication);
        //Toast.makeText(Drug_By_Indication.this, "Drug By Indication Activity", Toast.LENGTH_LONG).show();
        toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        indications = helper.getIndications();
        Collections.sort(indications);
        listView = (ListView)findViewById(R.id.list_indication);
        adapter = new ArrayAdapter<String>(this, R.layout.list_view_custom_layout, R.id.list_item, indications);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
    }
}
