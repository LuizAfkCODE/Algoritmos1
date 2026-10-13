//Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 6 do laço while
import java.util.Scanner;

public class TESTE121002 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;
        int menor = 1;

        while (contador <10) {
            System.out.println("Digite um numero");
            numero = entrada.nextInt();
            if (contador == 0) {
                menor = numero;
            } else if (numero < menor) {
                menor = numero;
            }
            contador++;
        }

        System.out.println("o menor numero digitado foi: " + menor);
        entrada.close();
    }

}
