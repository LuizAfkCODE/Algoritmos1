//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue o exercicio 7.
import java.util.Scanner;

public class TESTE290907 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu salario atual? ");
        double salario = entrada.nextDouble();
        System.out.println("Quantos anos você tem de empresa? ");
        int anos = entrada.nextInt();

        if( anos >= 5) {
            System.out.println("Parabens! o seu bonus é de 20%. Segue valor do bonus: " + (salario * 0.20));
        } else {
            System.out.println("Parabens! o seu bonus é de 10%. Segue valor do bonus: " + (salario * 0.10));
        }
        entrada.close();
    }

}
