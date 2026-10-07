import java.util.Scanner;

public class TESTE260901 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite o valor do raio");
        double raio = entrada.nextDouble();

        double pi = 3.14159;
        System.out.println (raio * raio * pi);

        entrada.close();
    }

}
