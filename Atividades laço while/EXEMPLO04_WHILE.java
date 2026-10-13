import java.util.Scanner;

public class EXEMPLO04_WHILE {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador;
        double nota, media, acumuladorNotas;
        contador = 0;
        acumuladorNotas =0;

        while (contador <5) {
            contador++;
            System.out.println("Digite a sua nota " + contador); nota = entrada.nextInt();
            acumuladorNotas = acumuladorNotas + nota;
        }
        media = acumuladorNotas / contador;
        System.out.println("Media " + media);
        entrada.close();
    }
}
