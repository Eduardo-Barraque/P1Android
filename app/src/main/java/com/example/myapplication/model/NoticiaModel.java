package com.example.myapplication.model;

import com.example.myapplication.entity.Autor;
import com.example.myapplication.entity.Noticia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class NoticiaModel {
    private List<Noticia> noticias;
    public NoticiaModel(){
        this.noticias = new ArrayList<>();
        Autor autor1 = new Autor(1,"Eduardo Barra","Taxista");
        noticias.add(new Noticia(1,"Heleno diz que presença de Cid em suposta reunião golpista de Bolsonaro com comandantes é fantasia!", new Date(),"é isso ai noticia 1",autor1));
    }
    public List<Noticia> buscarUltimas() {
        int start = Math.max(0, noticias.size() - 5);
        return new ArrayList<>(noticias.subList(start, noticias.size()));
    }
    public List<Noticia> buscarPorId(int id) {
        return this.noticias.stream().filter(n-> n.getId() == id).collect(Collectors.toList());
    }
}
