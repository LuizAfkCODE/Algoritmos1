import java.util.Scanner;

public class TESTE270901 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite o numero desejado: ");
        double numero = entrada.nextDouble();

        System.out.println ("O seu numero elevado ao quadrado é: ");
        System.out.println (Math.pow(numero, 2));

        System.out.println ("O seu numero elevado ao cubo é: ");
        System.out.println (Math.pow(numero, 3));

        System.out.println ("A raiz quadrada do seu numero é: ");
        System.out.println (Math.sqrt(numero));

        System.out.println ("O seu numero elevado a 10 é: ");
        System.out.println (Math.pow(numero, 10));

        entrada.close();

    }

}
