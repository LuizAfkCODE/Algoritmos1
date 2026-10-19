//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 7 da lista de exercicios do laço for
import java.util.Scanner;

public class TESTE181002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        double altura, peso;

        int maiores50 = 0;
        int pessoasPeso40 = 0;

        int quantidadeEntre10e20 = 0;
        double somaAlturas = 0;
        double mediaAlturas;

        double porcentagemPeso40;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Pessoa " + i);

            System.out.println("Digite a idade:");
            idade = entrada.nextInt();

            System.out.println("Digite a altura:");
            altura = entrada.nextDouble();

            System.out.println("Digite o peso:");
            peso = entrada.nextDouble();

            if (idade > 50) {
                maiores50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas = somaAlturas + altura;
                quantidadeEntre10e20++;
            }

            if (peso < 40) {
                pessoasPeso40++;
            }
        }

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("a) Pessoas maiores de 50 anos: "
                + maiores50);

        if (quantidadeEntre10e20 > 0) {
            mediaAlturas = somaAlturas / quantidadeEntre10e20;

            System.out.println("b) Media das alturas entre 10 e 20 anos: "
                    + mediaAlturas);
        } else {
            System.out.println("b) Nenhuma pessoa tem idade entre 10 e 20 anos.");
        }

        porcentagemPeso40 = pessoasPeso40 * 100.0 / 10;

        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 kg: "
                + porcentagemPeso40 + "%");

        entrada.close();
    }
}
