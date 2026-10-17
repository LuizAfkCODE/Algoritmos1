import java.util.Scanner;

public class EXEMPLO02_FOR {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, acumuladorIdades = 0;
        int contador;

        for (contador =0; contador < 5; contador++) {
        System.out.println("digite a sua idade: ");
        idade = entrada.nextInt();
        acumuladorIdades += idade;
        }
        System.out.println("a soma das idades é: " + acumuladorIdades);
    }
}
