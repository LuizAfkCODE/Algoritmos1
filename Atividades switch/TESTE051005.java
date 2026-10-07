//Exercicio 3 de switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051005 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual periodo você estuda?");
        System.out.println("M - para matutino");
        System.out.println("V - para vespertino");
        System.out.println("N - para noturno");
        char periodo = Character.toUpperCase(entrada.next().charAt(0));

        switch (periodo) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        entrada.close();
    }

}
