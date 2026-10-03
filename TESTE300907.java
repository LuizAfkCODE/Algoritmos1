//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio feito por mim com o mesmo principio do exercicio anterior (11) de varios else if do exercicio anterior com uma pontuação por nivel
import java.util.Scanner;

public class TESTE300907 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá seja bem vindo!");
        System.out.println("Qual o seu nickname?");
        String nome = entrada.nextLine();

        System.out.println("Agora informe o seu nivel: ");
        int nivel = entrada.nextInt();

        if (nivel >= 0 && nivel <= 99) {
            System.out.println("Seu nivel é Iniciante " + nome);
        } else if (nivel >= 100 && nivel <= 499) {
            System.out.println("Seu nivel é Aprendiz " + nome);
        } else if (nivel >= 500 && nivel <= 999) {
            System.out.println("Seu nivel é Veterano " + nome);
        } else if (nivel >= 1000 && nivel <= 1999) {
            System.out.println("Seu nivel é Mestre " + nome);
        } else {
            System.out.println("Seu nivel é Lendário " + nome);
        }
    }

}
