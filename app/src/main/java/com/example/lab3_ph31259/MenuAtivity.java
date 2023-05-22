package com.example.lab3_ph31259;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ativity);

        Button btnLL = findViewById(R.id.btnLL);
        Button btnRL = findViewById(R.id.btnRL);
        Button btnCL = findViewById(R.id.btnCL);

        btnLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAtivity.this, linearlayout.class));
            }
        });
        btnRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAtivity.this,RelativeLayout.class));
            }
        });
        btnCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuAtivity.this, Constraintlayou.class));
            }
        });
    }
}