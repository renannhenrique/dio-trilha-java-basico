/**
 * @author Renan Henrique Ermezindo
 * @version 1.0
 * @since 30/03/2025
 */
public class ExemploBreakContinue {

    public static void main(String[] args) {

        for(int numero = 1; numero <= 5; numero++){

            if (numero == 3) {
                System.out.println("Continuei apartir do: " + numero);
                continue;
            }
        }
    }
}
