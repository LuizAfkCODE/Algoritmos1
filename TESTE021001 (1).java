//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue o desafio proposto no ultimo slide, esse eu quebrei a cabeça um pouco apesar de ser parecido com todos os anteriores foi uma proposta interessante o meu codigo estava correto porem quando eu digitava o char em letra minuscula e nao maiuscula ele dava erro e a resposta errada, tive que pesquisar sobre como resolver e achei o metodo do Character.UpperCase e funcionou kkkk
import java.util.Scanner;

public class TESTE021001 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        System.out.println("Você é alfabetizado?");
        System.out.println("Digite 'S' para sim e 'N' para não.");
        char alfabetizacao = Character.toUpperCase(entrada.next().charAt(0));
        System.out.println("Voce tem titulo de eleitor?");
        char titulo = Character.toUpperCase(entrada.next().charAt(0));

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade == 16 || idade == 17) {
            System.out.println("Está apto para votar, o seu voto é facultativo.");
        } else if (idade >= 18 && idade <= 70 && alfabetizacao == 'S' && titulo == 'S') {
        System.out.println("Seu voto é obrigatório.");
        } else if (idade >= 18 && idade <= 70 && alfabetizacao == 'N' && titulo == 'S') {
            System.out.println("Está apto para votar, seu voto é facultativo.");
        } else if (idade > 70 && titulo == 'S') {
            System.out.println("Está apto para votar, seu voto é facultativo.");
        } else {
            System.out.println("Não pode votar, se regularize com o orgão responsavel.");
        }
}

}