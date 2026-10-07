//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 12.
import java.util.Scanner;

public class TESTE300908 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salario: ");
        double salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento do desconto do INSS");
        } else if (salario > 600 && salario <= 1200)  {
            System.out.println("Seu desconto é de 20% segue o valor descontado a seguir: " + (salario * 0.20));
        } else if (salario > 1200 && salario <= 2000) {
            System.out.println("Seu desconto é de 25% segue o valor descontado a seguir: " + (salario * 0.25));
        } else {
            System.out.println("Seu desconto é de 30% segue o valor descontado a seguir: " + (salario * 0.30));
        }
        entrada.close();
    }

} 
