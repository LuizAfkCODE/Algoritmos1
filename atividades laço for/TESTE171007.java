//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 5 da lista de exercicios do laço for

import java.util.Scanner;

public class TESTE171007 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2;
        double media;
        double somaMedia = 0;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("digite a primeira nota do aluno " + i + ":");
            nota1 = entrada.nextDouble();
            System.out.println("digite a segunda nota " + i + ":");
            nota2 = entrada.nextDouble();
            media = (nota1 + nota2) / 2;
            System.out.println("media do aluno " + i + ":" + media);
            somaMedia += media;
            if (media <= 3) {
                reprovados++;
                System.out.println("reprovado");
            } else if (media > 3 && media < 7) {
                exame++;
                System.out.println("terá que fazer o exame");
            } else {
                aprovados++;
                System.out.println("aprovado");
            }
        }
           double mediaClasse = somaMedia / 6;

        System.out.println("===== RESULTADO DA TURMA =====");
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de alunos em exame: " + exame);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

        entrada.close();
    }

}
