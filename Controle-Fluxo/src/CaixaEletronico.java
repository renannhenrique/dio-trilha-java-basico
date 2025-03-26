/**
 * Caixa Eletrônico
 * @author Renan Henrique Ermezindo
 * @version 1.0
 * @since 26/03/2025
 */
public class CaixaEletronico {

    public static void main(String[] args){

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        //Exemplo de Estrutura Condicional Composta
        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;

            System.out.println("Saldo Atual R$" + saldo);
        }else{
            System.out.println("Você não tem Saldo suficiente para este saque!");
        }

    }
}
