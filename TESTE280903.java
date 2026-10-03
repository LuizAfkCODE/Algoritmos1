//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio feito em aula com professor guilherme
import java.util.Scanner;

public class TESTE280903 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("======Menu de opções======");
        System.out.println("Opção 1 Cadastrar produto");
        System.out.println("Opção 2 Listar produtos");
        System.out.println("Opção 3 Sair do sistema");
        System.out.println("======Escolha uma opção======");

        int menu = entrada.nextInt();

        switch (menu) {
            case 1: 
                System.out.println("Você escolheu a opção 1. Que é cadastrar produto");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2. Que é listar produto");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3. Que é sair, obrigado.");
                break;
            default: 
                System.out.println("Item de menu inválido");             
        }
        entrada.close();
    }

}
