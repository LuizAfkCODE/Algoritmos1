//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 3 do laço for da lista de exercicios
import java.util.Scanner;

public class TESTE171004 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("digite um numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i + "");
        }
    }

}
