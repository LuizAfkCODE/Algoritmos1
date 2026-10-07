// Desafio feito por mim referente ao exercicio 3 do switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051006 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tipo de combustivel deseja?");
        System.out.println("G para Gasolina");
        System.out.println("E para Etanol");
        System.out.println("D para Diesel");
        System.out.println("A para Arla");
        char tipoCombustivel = Character.toUpperCase(entrada.next().charAt(0));

        switch (tipoCombustivel) {
            case 'G':
                System.out.println("Você escolheu gasolina!");
                break;
            case 'E':
                System.out.println("Você escolheu etanol!");
                break;
            case 'D':
                System.out.println("Você escolheu diesel!");
                break;
            case 'A':
                System.out.println("Você escolheu arla!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        entrada.close();
    }

}
