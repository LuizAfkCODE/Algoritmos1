//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 8 do laço while
import java.util.Scanner;

public class TESTE131001 {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        double nota1, nota2, media;

        while (contador <= 5) {
            System.out.println("aluno " + contador);

            do {
                System.out.println("digite a primeira nota de 0 a 10: ");
                nota1 = entrada.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota invalida digite uma nota entre 0 e 10.");
                }
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("digite a segunda nota de 0 a 10: ");
                nota2 = entrada.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida digite uma nota entre 0 e 10");
                }
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;

            System.out.println("media do aluno " + contador + ": " + media);

            contador++;
        }
    }

}
