package com.example.shakkhor.database;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class DrugByClassActivity extends AppCompatActivity {

    private static ListView listView;
    private static String[] Drugs= new String[]{"Drug1", "Drug2", "Drug3", "Drug4", "Drug5", "Drug6", "Drug7", "Drug8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_by_class);
        listView();
    }

    public void listView(){
        listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.drug_list,Drugs);
        listView.setAdapter(adapter);
    }

}
