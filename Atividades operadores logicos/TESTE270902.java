import java.util.Scanner;

public class TESTE270902 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite o seu numero para o cálculo: ");
        double numero = entrada.nextDouble();

        System.out.println ("O seu numero elevado ao quadrado é: ");
        System.out.println (Math.pow (numero, 2));

        System.out.println ("O seu numero elevado ao cubo é: ");
        System.out.println (Math.pow (numero, 3));
        
        System.out.println ("A raiz quadrada desse numero é: ");
        System.out.println (Math.sqrt (numero));

        System.out.println ("A potencia do seu numero elevado a 5 é: ");
        System.out.println (Math.pow (numero, 5));

        entrada.close();
    }
}
