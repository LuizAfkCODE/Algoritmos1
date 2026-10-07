//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio 3
import java.util.Scanner;

public class TESTE270906 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("O seu numero são iguais:");
        } else {
            if (numero1 > numero2) {
                System.out.println("A diferença é: " + (numero1 - numero2));
            } else {
                System.out.println("A diferença é: " + (numero2 - numero1));
            }
        }
        entrada.close();
    }
}
