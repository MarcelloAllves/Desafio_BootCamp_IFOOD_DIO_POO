package br.com.marcelloallves.bootcampIfood.dominio;
/*
    A constante XP_PADRAO poderá ser acessado fora dessa classe Conteudo isso é definido pelo modificador de
    acesso static.
    E quem poderá ter acesso serão todas as classes que herdarem de Conteudo, isso é definido pelo protect.
    O método abstract alcularXP() significa que todas as classes que herdarem de Conteudo, terão que
    implementar uma lógica nesse método.
    Uma classe definida como abstract não pode ser instanciada, ou seja, não podemos criar um objeto dessa classe.
    Uma classe abstrata serve para que aqueles atributos que forem comum a mais de uma classe, não necessitem
    serem reescrito em cada classe. Basta que essas classes extendam dessa classe abstrata.
    Deixando nosso código mas simples e enxuto, e de fácil manutenção.
 */
public abstract class Conteudo {
    protected static final Double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

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
}
