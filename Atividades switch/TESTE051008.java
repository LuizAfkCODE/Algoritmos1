// Desafio feito por mim referente ao exercicio 4 do switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051008 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione a sua categoria como cliente em nossa loja?");
        System.out.println("Categoria Prata - P");
        System.out.println("Categoria Ouro - O");
        System.out.println("Categoria VIP - V");
        char categoria = Character.toUpperCase(entrada.next().charAt(0));

        System.out.println("Qual valor da sua compra?");
        double compra = entrada.nextDouble();

        switch (categoria) {

            case 'P':
                System.out.println("Você recebeu um desconto de 5%, segue valor da sua compra: " + (compra - compra * 0.05));
                break;
            case 'O':
                System.out.println("Você recebeu um desconto de 10%, segue valor da sua compra: " + (compra - compra * 0.10));
                break;
            case 'V':
            System.out.println("Você recebeu um desconto de 15%, segue valor da sua compra:" + (compra - compra * 0.15));
                break;
            default:
                System.out.println("Selecione uma opção valida!");
        }
        entrada.close();
    }

}
