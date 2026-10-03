//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 13.
import java.util.Scanner;

public class TESTE300910 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Agora digite se voce quer multiplicar, somar, subtrair ou dividir");
        System.out.println("Multiplicação representa o simbolo: *");
        System.out.println("Divisão representa o simbolo: /");
        System.out.println("Adição representa o simbolo: +");
        System.out.println("Subtração representa o simbolo: -");
        char operacao = entrada.next().charAt(0);

     if (operacao == '+') {
        System.out.println("o seu calculo é: " + (numero1 + numero2));
    } else if (operacao == '-') {
        System.out.println("seu calculo é: " + (numero1 - numero2));
    } else if (operacao == '*') {
        System.out.println("seu calculo é: " + (numero1 * numero2));
    } else if (operacao == '/') {
        if (numero2 > 0) {
            System.out.println("seu calculo é: " + (numero1 / numero2));
        } else {
            System.out.println("impossivel de dividir");
        }
    } else {
        System.out.println("sinal invalido.");
    }
 }
}