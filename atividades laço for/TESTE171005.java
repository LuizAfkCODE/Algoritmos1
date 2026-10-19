//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue desafio feito por mim seguindo a mesma logica do exercicio anterior (3) onde eu fiz os numeros em ordem decrescente.
import java.util.Scanner;

public class TESTE171005 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("digite o numero ");
        numero = entrada.nextInt();

        for (int i = numero; i >= 1; i--) {
            System.out.println(i + "");
        }
    }

}
