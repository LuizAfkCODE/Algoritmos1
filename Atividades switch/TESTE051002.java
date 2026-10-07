// Desafio feito por mim seguindo a logica do exercicio 1 de switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051002 { 
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=======Selecione o genero de filme desejado=======");
        System.out.println("                  1. Ação");
        System.out.println("                  2. Comédia");
        System.out.println("                  3. Terror");
        System.out.println("             4. Ficção científica");
        System.out.println("                  5. Animação");
        System.out.println("==================================================");

        int numero = entrada.nextInt();

        switch (numero) {
            case 1: 
            System.out.println("Você escolheu Ação, boa escolha!");
            break;
            case 2: 
            System.out.println("Você escolheu Comédia, engraçado!");
            break;
            case 3: 
            System.out.println("Você escolheu Terror, assustador!");
            break;
            case 4: 
            System.out.println("Você escolheu Ficção científica, ótima escolha!");
            break;
            case 5: 
            System.out.println("Você escolheu animação, muito divertido!");
            break;
            default: 
            System.out.println("Você não escolheu uma tecla válida. Tente novamente!");
        }
        entrada.close();
    }

}
