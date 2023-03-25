package com.example.menuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<ListItem> retaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        this.InitializeRestaurant();

        ListView listView = (ListView) findViewById(R.id.listv_list);
        final ListAdapter lAdapter = new ListAdapter(this, retaurantList);
        listView.setAdapter(lAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(), lAdapter.getItem(position).getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeRestaurant(){
        retaurantList = new ArrayList<ListItem>();
        retaurantList.add(new ListItem(1, "양평해장국", "인천 연수구 송도동 13", "10:00~22:00",
                "032-214-0359", "한식", 1));
    }
}