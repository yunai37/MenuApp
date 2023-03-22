package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class RecommendActivity extends AppCompatActivity {
    Spinner pricestart, priceend;       // 스피너 변수
    Button next;
    String start, end;                  // 선택된 가격 값 담을 문자형 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        pricestart = findViewById(R.id.spinner_price);
        priceend = findViewById(R.id.spinner_price2);
        next = findViewById(R.id.btn_recommend);

        ArrayAdapter pricestartAdapter = ArrayAdapter.createFromResource(this, R.array.가격, android.R.layout.simple_spinner_dropdown_item);
        pricestartAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pricestart.setAdapter(pricestartAdapter);

        ArrayAdapter priceendAdapter = ArrayAdapter.createFromResource(this, R.array.가격, android.R.layout.simple_spinner_dropdown_item);
        priceendAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        priceend.setAdapter(priceendAdapter);

        pricestart.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //선택 시 db로 가도록 구현
                start = pricestart.getSelectedItem().toString();
            }
        });
        priceend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //선택 시 db로 가도록 구현
                end = priceend.getSelectedItem().toString();
            }
        });

        next.setOnClickListener(v -> {
            Intent intent = new Intent(this, RecommendResActivity.class);
            startActivity(intent);
       });
    }
}
