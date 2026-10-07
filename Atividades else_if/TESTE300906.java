//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 11.
import java.util.Scanner;

public class TESTE300906 {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá seja bem vindo! ");
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("A sua categoria é Infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("A sua categoria é Infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("A sua categoria é Juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("A sua categoria é Juvenil B.");
        } else {
            System.out.println("A sua categoria é Sênior.");
        }
        entrada.close();
    }

}
