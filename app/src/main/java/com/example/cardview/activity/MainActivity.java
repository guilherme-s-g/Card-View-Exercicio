package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.AdapterPostagem;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerViewPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewPostagem = findViewById(R.id.recyclerViewPostagem);

        //Define layout
        //Guide para definir colunas
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
//        Colocar postagens na horizontal
//        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagens();
        AdapterPostagem adapter = new AdapterPostagem(postagens);
        recyclerViewPostagem.setAdapter(adapter);
    }

    public void prepararPostagens()
    {
        Postagem p = new Postagem("Guilherme Sabino", "Viagem legal!", R.drawable.imagem1);
        this.postagens.add(p);
        p = new Postagem("João Oliveira", "Que incrível!!", R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Carlos Andrade", "Dia maravilhoso.", R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Barbara Luiza", "Que saudade desse dia", R.drawable.imagem4);
        this.postagens.add(p);
    }
}