import ParametrosInvalidosException.ParametrosInvalidosException;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor");
        int parametroUm = scan.nextInt();

        System.out.println("Digite o segundo valor");
        int parametroDois = scan.nextInt();

        try{

            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }


    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {


        }else{

            int contagem = parametroDois - parametroDois;

            for (int contador = 0; contador < contagem; contador++) {
                System.out.println(contador);
            }
        }
    }



}
