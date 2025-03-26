/**
 * Sistema de Medida
 * @author Renan Henrique Ermezindo
 * @version 1.0
 * @since 26/03/2025
 */
public class SistemaMedida {

    public static void main(String[] args) {

        //Trabalhando com a estrutura Switch Case
        String sigla = "G";

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
}
