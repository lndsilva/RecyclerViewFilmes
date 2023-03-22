package br.com.etecia.recyclerviewfilmes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Filmes> lstFilmes;

    //criando o construtor da classe com parâmetros


    public MyAdapter(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idTituloFilmes.setText(lstFilmes.get(position).getTitulo());
        holder.idImagemFilmes.setImageResource(lstFilmes.get(position).getImagem());

        holder.idCardFilmes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaFilmeActivity.class);

                intent.putExtra("Titulo", lstFilmes.get(position).getTitulo());
                intent.putExtra("Descricao", lstFilmes.get(position).getDescricao());
                intent.putExtra("Categoria", lstFilmes.get(position).getCategoria());
                intent.putExtra("ImagemFilme", lstFilmes.get(position).getImagem());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });

    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }

    //criar a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTituloFilmes;
        ImageView idImagemFilmes;
        CardView idCardFilmes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idImagemFilmes = itemView.findViewById(R.id.idImgFilmes);
            idCardFilmes = itemView.findViewById(R.id.idCardFilmes);
        }
    }
}
