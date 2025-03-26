/**
 * Resultado Escolar
 * @author Renan Henrique Ermezindo
 * @version 1.0
 * @since 26/03/2025
 */
public class ResultadoEscolar {

    public static void main(String[] args) {


        int nota = 6;

        //Exemplo de Estrutura Condicional Composta encadeada
        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Prova Recuperação");
        }else{
            System.out.println("Reprovado");
        }


    }
}
