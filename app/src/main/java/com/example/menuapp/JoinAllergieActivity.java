package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class JoinAllergieActivity extends AppCompatActivity {
    CheckBox egg, milk, wheat, bean, peanut, walnut, fish, shellfish, shrimp, crab;
    CheckBox korean, japanese, chinese, school, soup, barbecue, sushi, burger;
    Button skip, end;
    String allergieres, likeres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_allergie);

        egg = (CheckBox) findViewById(R.id.chk_egg);
        milk = (CheckBox) findViewById(R.id.chk_milk);
        wheat = (CheckBox) findViewById(R.id.chk_wheat);
        bean = (CheckBox) findViewById(R.id.chk_bean);
        peanut = (CheckBox) findViewById(R.id.chk_peanut);
        walnut = (CheckBox) findViewById(R.id.chk_walnut);
        fish = (CheckBox) findViewById(R.id.chk_fish);
        shellfish = (CheckBox) findViewById(R.id.chk_shellfish);
        shrimp = (CheckBox) findViewById(R.id.chk_shrimp);
        crab = (CheckBox) findViewById(R.id.chk_crab);

        korean = (CheckBox) findViewById(R.id.chk_korean);
        japanese = (CheckBox) findViewById(R.id.chk_japanese);
        chinese = (CheckBox) findViewById(R.id.chk_chinese);
        school = (CheckBox) findViewById(R.id.chk_school);
        soup = (CheckBox) findViewById(R.id.chk_soup);
        barbecue = (CheckBox) findViewById(R.id.chk_barbecue);
        sushi = (CheckBox) findViewById(R.id.chk_sushi);
        burger = (CheckBox) findViewById(R.id.chk_burger);

        skip = findViewById(R.id.btn_join_skip);
        end = findViewById(R.id.btn_join_end);

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "회원이 되신 걸 환영합니다!", Toast.LENGTH_LONG).show();
                sendAllergie(egg, milk, wheat, bean, peanut, walnut, fish, shellfish, shrimp, crab);
                sendLike(korean, japanese, chinese, school, soup, barbecue, sushi, burger);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        skip.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }

    private String sendAllergie(CheckBox egg, CheckBox milk, CheckBox wheat, CheckBox bean, CheckBox peanut,
                                CheckBox walnut, CheckBox fish, CheckBox shellfish, CheckBox shrimp, CheckBox crab){
        String allergie = "";
        if(egg.isChecked())
            allergie += (egg.getText().toString() + ",");
        if(milk.isChecked())
            allergie += (milk.getText().toString() + ",");
        if(wheat.isChecked())
            allergie += (wheat.getText().toString() + ",");
        if(bean.isChecked())
            allergie += (bean.getText().toString() + ",");
        if(peanut.isChecked())
            allergie += (peanut.getText().toString() + ",");
        if(fish.isChecked())
            allergie += (walnut.getText().toString() + ",");
        if(shellfish.isChecked())
            allergie += (shellfish.getText().toString() + ",");
        if(shrimp.isChecked())
            allergie += (shrimp.getText().toString() + ",");
        if(crab.isChecked())
            allergie += (crab.getText().toString());
        String[] hArr = allergie.split(",");            // ,로 분리해서 배열에 넣어줌

        allergieres = "";
        for(int i=0; i<hArr.length; i++){                   // 리턴 변수에 넣어줌
            if(i == hArr.length-1)                          // 배열의 마지막이면 , 안 붙이고 넣음
                allergieres += hArr[i];
            else allergieres += (hArr[i] + ", ");           // 마지막 아니면 뒤에 , 붙여서 넣음
        }
        return allergieres;
    }

    private String sendLike(CheckBox korean, CheckBox japanese, CheckBox chinese, CheckBox school, CheckBox soup,
                                CheckBox barbecue, CheckBox sushi, CheckBox burger){
        String like = "";
        if(korean.isChecked())
            like += (korean.getText().toString() + ",");
        if(japanese.isChecked())
            like += (japanese.getText().toString() + ",");
        if(chinese.isChecked())
            like += (chinese.getText().toString() + ",");
        if(school.isChecked())
            like += (school.getText().toString() + ",");
        if(soup.isChecked())
            like += (soup.getText().toString() + ",");
        if(barbecue.isChecked())
            like += (barbecue.getText().toString() + ",");
        if(sushi.isChecked())
            like += (sushi.getText().toString() + ",");
        if(burger.isChecked())
            like += (burger.getText().toString() + ",");
        String[] hArr = like.split(",");            // ,로 분리해서 배열에 넣어줌

        likeres = "";
        for(int i=0; i<hArr.length; i++){                   // 리턴 변수에 넣어줌
            if(i == hArr.length-1)                          // 배열의 마지막이면 , 안 붙이고 넣음
                likeres += hArr[i];
            else likeres += (hArr[i] + ", ");           // 마지막 아니면 뒤에 , 붙여서 넣음
        }
        return likeres;
    }
}
