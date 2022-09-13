package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.MyViewHolder>
{
    private List<Postagem> postagens;
    public AdapterPostagem(List<Postagem> p )
    {
        this.postagens = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);
        return  new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        Postagem postagem = postagens.get( position);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagemPostage.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount()
    {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagemPostage;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagemPostage = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
