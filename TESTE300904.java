//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 10
import java.util.Scanner;

public class TESTE300904 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = entrada.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os numeros são iguais");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior numero é: " + (numero1));
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior numero é: " + (numero2));
        } else {
            System.out.println(numero3);
        }
        entrada.close();
    }

}
