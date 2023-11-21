package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.entity.Noticia;

import java.util.List;

public class NotAdapter extends ArrayAdapter<Noticia> {
    public NotAdapter(Context context, List<Noticia> noticias) {
        super(context, 0, noticias);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.noticias_list,
                    parent, false);
        }
        Noticia noticia = getItem(position);
        TextView nameTextView = convertView.findViewById(R.id.noticiaTitulo);
        TextView nameTextView2 = convertView.findViewById(R.id.noticiaAutor);
        TextView nameTextView3 = convertView.findViewById(R.id.noticiaDataPublicacao);


        nameTextView.setText(noticia.getTitulo());
        nameTextView2.setText(noticia.getAutor().getNomeCompleto());
        nameTextView3.setText(noticia.getDataPublicacao());



        return convertView;
    }
}
