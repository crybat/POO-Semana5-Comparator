
package poo.semana5.comparator.alunos;

/**
 *
 * @author Mauro Pinto
 */
public class Aluno implements Comparable<Aluno> {

    private String nome;

    public Aluno(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    @Override
    public int compareTo(Aluno o)
    {
        return getNome().compareTo(o.getNome());
    }

}
