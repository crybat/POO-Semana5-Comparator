
package poo.semana5.comparator.alunos;

import java.util.Comparator;

/**
 *
 * @author Mauro Pinto
 */
public class AlunosComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2)
    {
        return o1.getNome().compareTo(o2.getNome());
    }

}
