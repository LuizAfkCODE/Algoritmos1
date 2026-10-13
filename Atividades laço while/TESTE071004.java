//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue desafio feito por mim seguindo a mesma logica do exercicio anterior (2) fazendo o calculo com numeros multiplos de 3.
import java.util.Scanner;

public class TESTE071004 {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int multiplos = 0;
        int naoMultiplos = 0;

        while (contador < 15) {
            contador++;
            System.out.println("Digite um numero: ");
            int numero = entrada.nextInt();
            if (numero % 3 == 0) {
                multiplos++;
            } else {
                naoMultiplos++;
            }
        }
        System.out.println("Seu numero multiplo é: " + multiplos);
        System.out.println("Seu numero não multiplo é: " + naoMultiplos);
    }
}
