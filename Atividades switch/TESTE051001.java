// Primeiro exercicio de Switch.
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051001 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7.");
         int numero = entrada.nextInt();

         switch (numero) {
            case 1: 
            System.out.println("Você digitou o numero 1.");
            System.out.println("Hojé é Domingo!");
            break;
            case 2:
            System.out.println("Você digitou o numero 2.");
            System.out.println("Hoje é Segunda-Feira!");
            break;
            case 3: 
            System.out.println("Você digitou o numero 3");
            System.out.println("Hoje é Terça-Feira!");
            break;
            case 4:
            System.out.println("Você digitou o numero 4");
            System.out.println("Hoje é Quarta-Feira!");
            break;
            case 5: 
            System.out.println("Você digitou o numero 5");
            System.out.println("Hoje é Quinta-Feira!");
            break;
            case 6:
            System.out.println("Você digitou o numero 6");
            System.out.println("Hoje é Sexta-Feira!");
            break;
            case 7:
            System.out.println("Você digitou o numero 7");
            System.out.println("Hoje é Sabado!");
            break;
            default:
                System.out.println("Selecione uma tecla valida correspondente de 1 a 7.");
         }
         entrada.close();
    }

}
