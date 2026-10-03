//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio 8
import java.util.Scanner;

public class TESTE290909 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        String senha =  entrada.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado!");
        }
        entrada.close();
    }
}
