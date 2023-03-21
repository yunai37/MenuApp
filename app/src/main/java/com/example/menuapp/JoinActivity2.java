package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity2 extends AppCompatActivity {
    Spinner year, gender;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_2);

        year = findViewById(R.id.spinner_year);
        gender = findViewById(R.id.spinner_gender);
        next = findViewById(R.id.btn_join_2);

        ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(this, R.array.출생연도, android.R.layout.simple_spinner_dropdown_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        year.setAdapter(yearAdapter);

        ArrayAdapter genderAdapter = ArrayAdapter.createFromResource(this, R.array.성별, android.R.layout.simple_spinner_dropdown_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(genderAdapter);

        year.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //선택 시 db로 가도록 구현
            }
        });

        gender.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //선택 시 db로 가도록 구현
            }
        });

        next.setOnClickListener(v -> {
            Intent intent = new Intent(this, JoinActivity3.class);
            startActivity(intent);
        });

    }
}
