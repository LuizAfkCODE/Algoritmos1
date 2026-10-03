import java.util.Scanner;

public class TESTE22 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Insira o seu nome: ");
        String nome = entrada.nextLine();
    
        System.out.println ("Insira a sua primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println ("Insira a sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println ("Insira a sua frequencia: ");
        double frequencia = entrada.nextDouble();

        System.out.println ("Insira o seu numero de faltas: ");
        int numeroDeFaltas = entrada.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media >= 60 && frequencia >= 75) {
            System.out.println ("Parabens " + nome + " voce foi aprovado");
        } else if (media >= 40 && frequencia >= 75) {
            System.out.println ("Atenção " + nome + ", voce está elegivel para AI");
        }else {
            System.out.println ("Infelizmente " + nome + ", voce foi reprovado");
        }
        if (numeroDeFaltas % 2 == 0) {
            System.out.println ("O numero de faltas é par!");
        } else {
            System.out.println ("O numero de faltas é impar!");
        }
        entrada.close();
    }

}
