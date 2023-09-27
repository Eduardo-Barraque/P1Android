package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;


public class HomeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Button button1 = findViewById(R.id.botao1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Noticia1.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.botao2);
        button2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent = new Intent(HomeActivity.this, Noticia2.class);
                  startActivity(intent);
              }
          }
        );
        Button button3 = findViewById(R.id.botao3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Noticia3.class);
                startActivity(intent);
            }
        });
    }
}