//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio feito por mim com o mesmo intuito do exercicio anterior (12) onde o sistema calcula quanto foi vendido x quanto ganhara de comissão pelas vendas total do mes
import java.util.Scanner;

public class TESTE300909 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor total vendido por você desse mes: ");
        double comissao = entrada.nextDouble();

        if ( comissao >= 0 && comissao <= 2000) {
            System.out.println("Você ganhou uma comissão de 5 % no valor de: " + (comissao * 0.05));
        } else if (comissao >= 2000 && comissao <= 5000) {
            System.out.println("Você ganhou uma comissão de 8 % no valor de: " + (comissao * 0.08));
        } else if (comissao >= 5000 && comissao <= 10000) {
            System.out.println("você ganhou uma comissão de 12 % no valor de: " + (comissao * 0.12));
        } else {
            System.out.println("Você ganhou uma comissão de 15 % no valor de: " + (comissao * 0.15));
        }
    }

}
