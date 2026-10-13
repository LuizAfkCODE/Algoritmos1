//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Profesor segue exercicio 3 do laco while
import java.util.Scanner;

public class TESTE111001 {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        int sequencia = 1;

        while (sequencia <= numero) {
            System.out.println("Sua sequencia é: " + sequencia);
            sequencia = sequencia * 2;
        }
    }

}
