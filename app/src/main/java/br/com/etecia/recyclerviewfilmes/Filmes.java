package br.com.etecia.recyclerviewfilmes;

public class Filmes {
    private String titulo;
    private String descricao;
    private String categoria;
    private int imagem;

    //criar o construtor com parâmetros alt+insert

    public Filmes(String titulo, String descricao, String categoria, int imagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    //criando os métodos de acesso get and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

