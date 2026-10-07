// Exercicio 4 do switc
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051007 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu plano:");
        System.out.println("Plano A - Aumento de 10%");
        System.out.println("Plano B - Aumento de 15%");
        System.out.println("Plano C - Aumento de 20%");
        char plano = Character.toUpperCase(entrada.next().charAt(0));
        System.out.println("Agora digite o seu salario:");
        double salario = entrada.nextDouble();

        switch (plano) {
            case 'A':
                System.out.println("seu novo salario é de: " + (salario + salario * 0.10));
                break;
            case 'B':
                System.out.println("seu novo salario é de: " + (salario + salario * 0.15));
                break;
            case 'C':
                System.out.println("seu novo salario é de: " + (salario + salario * 0.20));
                break;
            default:
                System.out.println("Selecione uma tecla válida");
                   
        }
        entrada.close();
    }

}
