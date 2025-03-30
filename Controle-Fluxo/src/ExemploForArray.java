import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Exemplo ForArray
 * @author Renan Henrique Ermezindo
 * @version 1.0
 * @since 30/03/2025
 */
public class ExemploForArray {


    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS", "RENAN"};

        System.out.println("Total alunos(a) cadastrados " + alunos.length);

        /*
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno(a) no indice x= " + x + " - " + alunos[x]);
        }
        )
         */

        /*

        int x = 0;

            while (x < alunos.length) {

                System.out.println("O aluno(a) no indice x= " + x + " - " + alunos[x]);
                x++;
            }

          */

        //foreach para arrays
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
