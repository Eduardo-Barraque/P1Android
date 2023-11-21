package com.example.myapplication.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.myapplication.NotAdapter;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NotAdapter;
import com.example.myapplication.R;
import com.example.myapplication.entity.Noticia;
import com.example.myapplication.model.NoticiaModel;

import java.text.DateFormatSymbols;
import java.util.List;

public class NewHomeActivity extends AppCompatActivity{
    ListView listViewLayout;
    NoticiaModel noticias;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_home);
        noticias = new  NoticiaModel();
        List<Noticia> ultimasNoticias = noticias.buscarUltimas();
        NotAdapter adaptador = new NotAdapter(this, ultimasNoticias);
        listViewLayout.setAdapter(adaptador);
        listViewLayout = findViewById(R.id.listViewLayout);
            listViewLayout.setAdapter(adaptador);

        listViewLayout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Obtenha a notícia clicada
                Noticia noticiaClicada = ultimasNoticias.get(position);

                // Crie uma Intent para abrir a tela de detalhes
                Intent intent = new Intent(NewHomeActivity.this, NoticiaActivity.class);

                // Passe os dados da notícia para a atividade de detalhes
                intent.putExtra("titulo", noticiaClicada.getTitulo());
                intent.putExtra("conteudo", noticiaClicada.getConteudo());

                // Inicie a nova atividade
                startActivity(intent);
            }

        });
    }
}
