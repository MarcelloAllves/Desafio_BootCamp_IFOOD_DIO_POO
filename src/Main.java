import br.com.marcelloallves.bootcampIfood.dominio.Conteudo;
import br.com.marcelloallves.bootcampIfood.dominio.Curso;
import br.com.marcelloallves.bootcampIfood.dominio.Mentoria;

/*
    Ao declarar Conteudo conteudoCurso = new Curso() e Conteudo conteudoMentoria = new Mentoria(), estou dizendo que
    tudo que tem em Conteudo "tem" em Curso e em Mentoria, mas nem tudo que temos em Curso ou em Mentoria
    temos em Conteudo, isso significa Polimorfismo.
 */

public class Main {
    public static void main(String[] args) {
        Conteudo conteudoCurso = new Curso();
        Conteudo conteudoMentoria = new Mentoria();
    }
}
