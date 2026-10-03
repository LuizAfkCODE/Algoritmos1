//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio 1
import java.util.Scanner;

public class TESTE270903 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Insira um numero: ");
        double numero = entrada.nextDouble();

        if (numero >20) {
            System.out.println ("O seu resultado é: " + numero / 2);
        }
        entrada.close();
    }

}
