import java.util.Scanner;
public class TESTE2209 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a sua nota:");
        double nota = entrada.nextDouble();

        System.out.println("Digite a sua frequência:");
        double frequencia = entrada.nextDouble();

        if (nota >=60 && frequencia >=75) {
            System.out.println ("Parabens " + nome + " voce foi aprovado");

        } else {
            System.out.println ("infelizmente" + nome + " voce foi reprovado");
        }

        entrada.close();

    }

    
}

