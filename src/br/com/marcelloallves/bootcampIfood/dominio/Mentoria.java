package br.com.marcelloallves.bootcampIfood.dominio;

import java.time.LocalDate;

public class Mentoria {
    String tiutulo;
    String descricao;
    LocalDate data;

    public Mentoria() {
    }

    public String getTiutulo() {
        return tiutulo;
    }

    public void setTiutulo(String tiutulo) {
        this.tiutulo = tiutulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tiutulo='" + tiutulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
