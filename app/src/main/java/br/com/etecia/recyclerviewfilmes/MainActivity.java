package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("O Rei da Montanha",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.rei_montanha));


        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);



    }
}