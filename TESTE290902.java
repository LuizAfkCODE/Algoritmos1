//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio 5
import java.util.Scanner;

public class TESTE290902 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o numero: ");
        int numero = entrada.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        } 
        entrada.close();
    }

}   
