package com.example.menuapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RecommendResActivity extends AppCompatActivity {
    TextView name, menu;            // 닉네임, 추천되는 메뉴
    Button info, select, re;        // 상세정보 보기, 메뉴 이용하기, 재추천
    String selectmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_res);

        name = findViewById(R.id.name_recommend_res);
        menu = findViewById(R.id.menu_recommend_res);
        info = findViewById(R.id.btn_recommend_res);
        select = findViewById(R.id.btn_recommend_res2);
        re = findViewById(R.id.btn_recommend_res3);

        info.setOnClickListener(v -> {                      // 음식점 화면으로 이동
            Intent intent = new Intent(this, RestaurantActivity.class);
            startActivity(intent);
        });
        select.setOnClickListener(v -> {                    // 변수에 저장 후 토스트 메시지 출력
            selectmenu = select.getText().toString();
            Toast.makeText(getApplicationContext(), "확정되었습니다!", Toast.LENGTH_SHORT).show();
        });
        re.setOnClickListener(v -> {                        // 메뉴 추천 화면으로 이동(이용자 번거로움) or 이 화면 재실행 ??
            Intent intent = new Intent(this, RecommendResActivity.class);
            startActivity(intent);
        });

    }
}
