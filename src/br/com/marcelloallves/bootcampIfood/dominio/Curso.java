package br.com.marcelloallves.bootcampIfood.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;


    @Override
    public double calcularXP() {
        return XP_PADRAO * getCargaHoraria();
    }


    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
