//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue o exercicio 9 do emprestimo.
import java.util.Scanner;

public class TESTE300902 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o seu salario bruto: ");
        double salario = entrada.nextDouble();
        System.out.println("Insira o valor da prestação: ");
        double prestacao = entrada.nextDouble();

        if (prestacao <= salario * 0.30) {
            System.out.println("Emprestimo concedido!");
        } else {
            System.out.println("Emprestimo não pode ser concedido!");
        }
        entrada.close();
    }

}
