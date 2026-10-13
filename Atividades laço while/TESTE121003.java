//Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 7 de calculo de imc de 10 pessoas
import java.util.Scanner;

public class TESTE121003 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso;
        double altura;
        double imc;
        int contador = 0;
        int quantidade = 0;

        while (contador < 10) {
            System.out.println("digite o seu peso: ");
            peso = entrada.nextDouble();

            System.out.println("Digite a sua altura: ");
            altura = entrada.nextDouble();

            imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
            quantidade++;
            }
            contador++;
        }
        System.out.println("Quantidade de pessoas com IMC entre 18,5 e 24,9: " + quantidade);
    }
}
