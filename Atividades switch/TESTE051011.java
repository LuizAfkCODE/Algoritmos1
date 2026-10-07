// Exercicio 6 do switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051011 {
public static void main (String [] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("____________________________________");
    System.out.println(" Código   Produto             Preço");
    System.out.println("____________________________________");
    System.out.println(" 100      Cachorro-Quente    R$ 1,20");
    System.out.println(" 101      Bauru Simples      R$ 1,30");
    System.out.println(" 102      Bauru com ovo      R$ 1,50");
    System.out.println(" 103      Hamburguer         R$ 1,20");
    System.out.println(" 104      Cheeseburguer      R$ 1,30");
    System.out.println(" 105      Refrigerante       R$ 1,00");
    System.out.println("____________________________________");

    System.out.println("Qual o codigo do produto desejado?");
    int codigo = entrada.nextInt();
    System.out.println("Qual a quantidade de itens que você deseja do produto?");
    int quantidade = entrada.nextInt();

    switch (codigo) {
        case 100:
            System.out.println("Produto: Cachorro-Quente.");
            System.out.println("Valor a pagar R$" + 1.20 * quantidade);
        break;
        case 101:
            System.out.println("Produto: Bauru-Simples.");
            System.out.println("Valor a pagar R$" + 1.30 * quantidade);
        break;
        case 102:
            System.out.println("Produto: Bauru com ovo");
            System.out.println("Valor a pagar R$" + 1.50 * quantidade);
        break;
        case 103:
            System.out.println("Produto: Hamburguer");
            System.out.println("Valor a pagar R$" + 1.20 * quantidade);
        break;
        case 104:
            System.out.println("´Produto: Cheeseburguer");
            System.out.println("Valor a pagar R$" + 1.30 * quantidade);
        break;
        case 105:
            System.out.println("Produto: Refrigerante");
            System.out.println("Valor a pagar R$" + 1.00 * quantidade);
        default:
            System.out.println("Insira uma opção valida.");
}
entrada.close();
}
}