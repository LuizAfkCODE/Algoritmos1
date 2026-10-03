import java.util.Scanner;

public class TESTE260902 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite a base do triangulo: ");
        double area = entrada.nextDouble();

        System.out.println ("Digite a altura do triangulo: ");
        double altura = entrada.nextDouble();

        System.out.println ((area * altura) /2);

        entrada.close();
    }

}
