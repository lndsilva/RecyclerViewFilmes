package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;

    //Declarar o recycler view
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("O Rei da Montanha",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.rei_montanha));
        listaFilmes.add(
                new Filmes("O Apocalipe",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.apocalipe));
        listaFilmes.add(
                new Filmes("2067",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.doismilesessetnaesete));
        listaFilmes.add(
                new Filmes("Medo Profundo",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.medo));
        listaFilmes.add(
                new Filmes("A Menina",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.menina));
        listaFilmes.add(
                new Filmes("Na Ponta da Bala",
                        "Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha.",
                        "Aventura",
                        R.drawable.pontabala));


        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //Tipo de layout de a lista irá seguir
        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar a lista mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}