package com.unialfa.aula5.model;

import java.time.LocalDateTime;

public class Comentario {
    private String titulo;
    private String texto;
    private LocalDateTime publicacao;
    private String autor;
    private String palavra_chave;

    public String getPalavra_chave() {
        return palavra_chave;
    }

    public void setPalavra_chave(String palavra_chave) {
        this.palavra_chave = palavra_chave;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    public LocalDateTime getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(LocalDateTime publicacao) {
        this.publicacao = publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {

        this.texto = texto;
    }


}
