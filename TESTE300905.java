//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio feito por mim com a mesma logica do exercicio anterior 10 porem com um sistema de pontuação, tentei fazer com que lesse os nomes dos participantes mas achei confuso e n consegui.
import java.util.Scanner;

public class TESTE300905 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá seja bem vindo ao sistema de pontuação do mini game! Me diga, qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println(nome + " Digite a primeira pontuação: ");
        int pontuacao1 = entrada.nextInt();
        System.out.println(nome + " Agora digite a segunda pontuação: ");
        int pontuacao2 = entrada.nextInt();
        System.out.println(nome + " Por fim digite a terceira e ultima pontuação: ");
        int pontuacao3 = entrada.nextInt();

        if(pontuacao1 == pontuacao2 && pontuacao2 == pontuacao3) {
            System.out.println(nome + " Vocês empataram!");
        } else if (pontuacao1 > pontuacao2 && pontuacao1 > pontuacao3) {
            System.out.println(nome + " A maior pontuação do mini-game é: " + (pontuacao1) + (" Parabens!"));
        } else if (pontuacao2 > pontuacao1 && pontuacao2 > pontuacao3) {
            System.out.println(nome + " A maior pontuação do mini-game é: " + (pontuacao2) + (" Parabens!"));
        } else {
            System.out.println(nome + " A maior pontuação do mini-game é: " + (pontuacao3) + (" Parabens!"));
        }
        entrada.close();
     }

}
