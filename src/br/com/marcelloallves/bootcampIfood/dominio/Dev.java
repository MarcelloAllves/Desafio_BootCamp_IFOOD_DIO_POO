package br.com.marcelloallves.bootcampIfood.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
/*
    Ao utilizarmos a coleção do tipo Set, garante que não poderemos duplicar itens na nossa lista, ou seja,
    não poderemos matricular no mesmo curso, e não teremos na coleção conteudosConcluidos repetição de um curso
    já concluído. Lembrando que a classe LinkedhashSet herda da classe Set, sendo isso um exemplo de polimorfismo.
    Declarando Set<Conteudo> significa que esta lista poderá conter atributos não só de Conteudo como de todas as
    classes que herdarem de Conteudo e, nesse caso Curso e Mentoria.
    inscreverBootCamp(BootCamp bootCamp) -> Quando se inscrever num bootcamp, o aluno terá acesso a todo
    conteúdo do bootcamp inscrito.
    progredir() -> Para o aluno progredir, então temos que pegar todos o Conteudo conteudoInscritos e adiciona-los
    dentro do Set de conteudosInscritos.
 */
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp){
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsEscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public Double calcularTotalXP (){
       return this.conteudosConcluidos
               .stream()
               .mapToDouble(conteudo -> conteudo.calcularXP())
               .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
