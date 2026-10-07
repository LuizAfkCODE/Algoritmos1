//Desafio feito por mim referente ao exercicio 5 de switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051010 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("M - Calcular a média das duas notas");
        System.out.println("D - Mostrar a diferença entre a maior e a menor nota");
        System.out.println("S - Somar as duas notas");
        System.out.println("P - Multiplicar as duas notas");
        char opcao = Character.toUpperCase(entrada.next().charAt(0));

        switch (opcao) {

            case 'M':
                System.out.println("O calculo da media das duas notas é de: " + (nota1 + nota2) / 2);
            break;
            case 'D':
                if (nota1 > nota2) {
                    System.out.println("A diferença entre a maior e a menor nota é: " + (nota1 - nota2));
                } else {
                    System.out.println("A diferença entre a maior e a menor nota é: " + (nota2 - nota1));
                }
            break;
            case 'S':
                System.out.println("A soma das duas notas é de: " + (nota1 + nota2));
            break;
            case 'P':
                System.out.println("A multiplicação das notas é de: " + (nota1 * nota2));
            break;
            default:
                System.out.println("Selecione uma tecla valida!");
    }
entrada.close();
}
}
