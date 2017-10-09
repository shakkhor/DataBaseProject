package com.example.shakkhor.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Drug_From_Class extends AppCompatActivity {


    MakeDatabase helper = new MakeDatabase(this);
    Toolbar toolbar;
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> drugs;
    int class_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug__from__class);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        class_id = Drug_By_Class.getClass_id();
        drugs = helper.getDrugByClass(class_id);
        listView = (ListView)findViewById(R.id.list_drug_by_class);

        adapter = new ArrayAdapter<String>(this, R.layout.list_view_custom_layout, R.id.list_item, drugs);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
