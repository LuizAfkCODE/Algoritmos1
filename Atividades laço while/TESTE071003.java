//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 2 fo laco while
import java.util.Scanner;

public class TESTE071003 {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int par = 0;
        int impar = 0;

        while (contador <10) {
            contador ++;
            System.out.println("Digite o numero: ");
            int numero = entrada.nextInt();
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
        }
        System.out.println("Quantidade de pares é: " + par);
        System.out.println("Quantidace de impares é: " + impar);
    }
}
