import java.util.Scanner;

public class TESTE260903 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println ("Qual o seu ano de nascimento? ");
        int anoNascimento = entrada.nextInt();

        System.out.println ("Qual é o ano atual? ");
        int anoAtual = entrada.nextInt();

        System.out.println ("A sua idade é: ");
        System.out.println (anoAtual - anoNascimento);

        System.out.println ("Em 2030 voce terá: ");
        System.out.println (2030 - anoNascimento);

        entrada.close();
    }

}
