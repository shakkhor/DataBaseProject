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

    String[] Drug= {"Drug1", "Drug2", "Drug3", "Drug4", "Drug5", "Drug6", "Drug7", "Drug8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_by_class);



        ListView listView = (ListView)findViewById(R.id.listView);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Drug.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}
