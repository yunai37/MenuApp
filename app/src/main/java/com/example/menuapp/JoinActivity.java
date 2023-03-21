package com.example.menuapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;

public class JoinActivity extends AppCompatActivity {
    TextInputEditText id, pw, pw2, name;
    Button idcheck, pwcheck, namecheck, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        id = findViewById(R.id.join_id);
        pw = findViewById(R.id.join_pw);
        pw2 = findViewById(R.id.join_pw2);
        name = findViewById(R.id.join_name);
        idcheck = findViewById(R.id.btn_join_id);
        pwcheck = findViewById(R.id.btn_join_pw);
        namecheck = findViewById(R.id.btn_join_name);

        pwcheck.setOnClickListener(v -> {
            if(pw.getText().toString().equals(pw2.getText().toString())){
                pwcheck.setText("비밀번호가 일치합니다.");
            }
            else {
                Toast.makeText(JoinActivity.this, "비밀번호가 다릅니다.", Toast.LENGTH_LONG).show();
            }
        });

        next = findViewById(R.id.btn_join_1);
        next.setOnClickListener(v -> {
            Intent intent = new Intent(this, JoinActivity2.class);
            startActivity(intent);
        });
    }

}