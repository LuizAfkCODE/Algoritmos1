// Desafio feito por mim seguindo exemplo do exercicio 2.
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051004 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in); 

        System.out.println("Escolha um numero de 1 a 6 e sorteie o seu transporte! :D!");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Você escolheu o carro, otima escolha!");
                break;
            case 2:
                System.out.println("Você escolheu moto, otima escolha!");
                break;
            case 3:
                System.out.println("Você escolheu bicicleta, otima escolha!");
                break;
            case 4:
                System.out.println("Você escolheu onibus, otima escolha!");
                break;
            case 5:
                System.out.println("Você escolheu trem, otima escolha!");
                break;
            case 6:
                System.out.println("Você escolheu avião, otima escolha!");
                break;
                default:
                System.out.println("Selecione uma tecla valida!");
        }
        entrada.close();
    }

}
