//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio 2
import java.util.Scanner;

public class TESTE270905 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if ( idade >18) {
            System.out.println ("Você é maior de idade!");
        } else {
            System.out.println ("Você é menor de idade!");
        }
        entrada.close();
    }

}
