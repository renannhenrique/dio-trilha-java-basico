import java.util.Locale;
import java.util.Scanner;

/**
 * ContaTerminal
 * @author Renan Henrique Ermezindo
 * @version  1.0
 * @since 25/03/2025
 */
public class ContaTerminal {

    private int numero = 1021;
    private String agencia = "067-8";
    private String nomeCliente = "Mario Andrade";
    private double saldo = 237.48;



   /**
   *Criar Conta Bancaria
   */
    public void criarConta(){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Conta!");
        this.numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        this.agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        this.nomeCliente = scanner.next();

        System.out.println("Deposite um valor minimo de R$50,00 para abrir a sua conta!");
        this.saldo = scanner.nextDouble();


        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo R$" + this.saldo + " já está disponivel para saque.");


    }

}
