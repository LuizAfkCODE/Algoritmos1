// Desafio feito por mim seguindo o mesmo exemplo da atividade 6 do switch.
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE061001 { 
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o codigo do produto que deseja: ");
        int codigo1 = entrada.nextInt();
        System.out.println("Digite a quantidade que você deseja do produto: ");
        int quantidade1 = entrada.nextInt();
        System.out.println("Digite o codigo do segundo produto q deseja");
        int codigo2 = entrada.nextInt();
        System.out.println("Digite a quantidade do segundo produto");
        int quantidade2 = entrada.nextInt();

        switch (codigo1) {
            case 201:
                System.out.println("Camiseta - R$35,00");
                System.out.println("Valor a pagar: " + 35.00 * quantidade1);
                break;
            case 202:
                System.out.println("Boné - R$25,00");
                System.out.println("Valor a pagar: " + 25.00 * quantidade1);
                break;
            case 203:
                System.out.println("Calça - R$80,00");
                System.out.println("Valor a pagar: " + 80.00 * quantidade1);
                break;
            case 204:
                System.out.println("Tênis - R$150,00");
                System.out.println("Valor a pagar: " + 150.00 * quantidade1);
                break;
            default:
                System.out.println("Escolha uma opção valida.");
        }

        switch (codigo2) {
            case 201:
                System.out.println("Camiseta - R$35,00");
                System.out.println("Valor a pagar: " + 35.00 * quantidade2);
                break;
            case 202:
                System.out.println("Boné - R$25,00");
                System.out.println("Valor a pagar: " + 25.00 * quantidade2);
                break;
            case 203:
                System.out.println("Calça - R$80,00");
                System.out.println("Valor a pagar: " + 80.00 * quantidade2);
                break;
            case 204:
                System.out.println("Tênis - R$150,00");
                System.out.println("Valor a pagar: " + 150.00 * quantidade2);
                break;
            default:
                System.out.println("Seleciona uma opção válida.");        
        }
    }

}
