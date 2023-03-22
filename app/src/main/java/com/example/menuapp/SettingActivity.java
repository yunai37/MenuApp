package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {
    ImageButton back;
    EditText name;
    TextView id, allergie, like;
    Button set_allergie, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        back = findViewById(R.id.imgbtn_setting);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(this, MypageActivity.class);
            startActivity(intent);
        });

        name = findViewById(R.id.name_setting);
        id = findViewById(R.id.id_setting);
        allergie = findViewById(R.id.allergie_setting);
        like = findViewById(R.id.like_setting);
        set_allergie = findViewById(R.id.btn_setting);
        set_allergie.setOnClickListener(v -> {
            Intent intent = new Intent(this, SettingAllergieActivity.class);
            startActivity(intent);
        });
        save = findViewById(R.id.btn_setting2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MypageActivity.class);
                Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}
