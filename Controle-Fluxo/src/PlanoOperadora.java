import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja Bem-vindo aos planos da operadora");
        System.out.println("BASIC, MIDIA e TURBO");
        System.out.println("Digite: B, M ou T");

        String planoSelecionado = scanner.next();

        switch (planoSelecionado) {

            case "B":
                System.out.println("BASIC: 100 minutos de ligação");
                break;

            case "M":
                System.out.println("MIDIA: 100 minutos de ligação + Whats e Instagram grátis");
                break;

            case "T":
                System.out.println("TURBO: 100 minutos de ligação + Whats e Instagram grátis + 5GB Youtube");
                break;

            default:
                System.out.println("Opção invalida!");
                break;
        }
    }
}
