//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exemplo que eu fiz sozinho referente ao exercicio 7 onde o java ele faz o calculo de quantos % de desconto eu ganhei.
import java.util.Scanner;

public class TESTE290908 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Qual o valor da sua compra? ");
        double valorCompra = entrada.nextDouble();

        if ( valorCompra >= 500) {
            System.out.println("Você obteve um desconto de R$: " + ( valorCompra * 0.15));
        } else {
            System.out.println("Você obteve um desconto de R$: " + (valorCompra * 0.05));
        }
        entrada.close();
    }

}
