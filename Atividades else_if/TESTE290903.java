//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exemplo feito por mim do exercicio 5 
import java.util.Scanner;

public class TESTE290903 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a sua idade:");
        int idade = entrada.nextInt();

        if (idade >= 18 && idade <= 29) {
            System.out.println("Está na faixa");
        } else {
            System.out.println("Não está na faixa");
        }
        entrada.close();
    }

}
