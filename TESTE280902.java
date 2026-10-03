//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Exercicio 4
// Professor pelo o que eu entendi do exercicio é para o programa ler dois numeros e o java exibir o maior primeiro e menor em seguida, certo?
import java.util.Scanner;

public class TESTE280902 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1);
            System.out.println(numero2);
        } else {
            System.out.println(numero2);
            System.out.println(numero1);
        }
        entrada.close();
 }
}