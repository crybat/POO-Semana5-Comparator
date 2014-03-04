

package poo.semana5.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import poo.semana5.comparator.alunos.Aluno;
import poo.semana5.comparator.alunos.AlunosComparator;

/**
 *
 * @author Mauro Pinto
 */
public class POOSemana5Comparator
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<Aluno> la = new ArrayList<>();
        la.add(new Aluno("Zorro"));
        la.add(new Aluno("Mauro"));
        la.add(new Aluno("Joaquim"));
        la.add(new Aluno("Mara"));
        Collections.sort(la, new AlunosComparator());

        for (Aluno aluno : la) {
            System.out.println(aluno.getNome());
        }
        System.out.println("---");

        la = new ArrayList<>();
        la.add(new Aluno("Mauro"));
        la.add(new Aluno("Joaquim"));
        la.add(new Aluno("Mara"));
        la.add(new Aluno("Zorro"));
        Collections.sort(la);

        for (Aluno aluno : la) {
            System.out.println(aluno.getNome());
        }
    }

}
