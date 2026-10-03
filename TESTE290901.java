//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor, segue exemplo feito por mim referente ao exercicio 4 do if_else é um programa q lê numeros decimais e descobre qual deles é o maior
import java.util.Scanner;

public class TESTE290901 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Insira o segundo numero: ");
        double numero2 = entrada.nextDouble();

        if (numero1 > numero2) {
            System.out.println("A diferença entre eles é:" + (numero1 - numero2));
        } else if (numero2 > numero1) {
            System.out.println("A soma entre eles é:" + (numero2 + numero1));
        } else {
            System.out.println("Os numeros são iguais.");
        }
        entrada.close();
    }

}
