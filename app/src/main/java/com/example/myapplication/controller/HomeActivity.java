package com.example.myapplication.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Noticia1;
import com.example.myapplication.Noticia2;
import com.example.myapplication.Noticia3;
import com.example.myapplication.R;
import com.example.myapplication.model.NoticiaModel;


public class HomeActivity extends AppCompatActivity {
    private NoticiaModel noticiaModel;
    private ListView listViewNoticias;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        noticiaModel = new NoticiaModel();
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