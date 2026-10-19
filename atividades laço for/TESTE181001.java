//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio 6 da lista de exercicios laço for
import java.util.Scanner;

public class TESTE181001 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulos = 0;
        int brancos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Eleitor " + i);
            System.out.println("Digite seu voto:");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.println("4 - Candidato 4");
            System.out.println("5 - Voto nulo");
            System.out.println("6 - Voto em branco");

            voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;

                case 2:
                    candidato2++;
                    break;

                case 3:
                    candidato3++;
                    break;

                case 4:
                    candidato4++;
                    break;

                case 5:
                    nulos++;
                    break;

                case 6:
                    brancos++;
                    break;

                default:
                    System.out.println("Voto invalido!");
                    i--;
                    break;
            }
        }

        double percentualNulos = nulos * 100.0 / 10;
        double percentualBrancos = brancos * 100.0 / 10;
        double percentualBrancosNulos =
                (brancos + nulos) * 100.0 / 10;

        System.out.println("\n===== RESULTADO DA ELEICAO =====");

        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");

        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);

        System.out.println("Percentual de votos nulos: "
                + percentualNulos + "%");

        System.out.println("Percentual de votos em branco: "
                + percentualBrancos + "%");

        System.out.println("Percentual de votos brancos e nulos: "
                + percentualBrancosNulos + "%");

        entrada.close();
    }
}
