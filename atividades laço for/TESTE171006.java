//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 4 da lista for.
import java.util.Scanner;

public class TESTE171006 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        double altura;
        double acumuladorAlturas = 0;
        int contadorMaiores50 =0;
        double mediaAlturas;

        for (int i = 1; i <=10; i++) {
            System.out.println("qual a sua altura? ");
            altura = entrada.nextDouble();

            System.out.println("qual a sua idade? ");
            idade = entrada.nextInt();

            if (idade > 50) {
                acumuladorAlturas += altura;
                contadorMaiores50++;
            }
        }
        if (contadorMaiores50 > 0) {
                mediaAlturas = acumuladorAlturas / contadorMaiores50;
                System.out.println("a media das alturas é " + mediaAlturas);
            } else {
                System.out.println("ninguem tem mais que 50 anos.");
            }
        entrada.close();
    }

}
