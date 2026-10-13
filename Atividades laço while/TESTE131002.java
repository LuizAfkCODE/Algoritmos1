//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor segue exercicio 9 do laço while
import java.util.Scanner;

public class TESTE131002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo, quantidade;
        char continuar;
        double preco = 0, valorProduto, valorTotal = 0;

        do {
            System.out.println("===== CARDAPIO DA LANCHONETE =====");
            System.out.println("100 - Cachorro-quente - R$ 1,20");
            System.out.println("101 - Bauru simples - R$ 1,30");
            System.out.println("102 - Bauru com ovo - R$ 1,50");
            System.out.println("103 - Hamburguer - R$ 1,20");
            System.out.println("104 - Cheeseburguer - R$ 1,30");
            System.out.println("105 - Refrigerante - R$ 1,00");

            System.out.println("Digite o codigo do produto: ");
            codigo = entrada.nextInt();

            System.out.println("Digite a quantidade desejada: ");
            quantidade = entrada.nextInt();

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;

                case 101:
                    preco = 1.30;
                    break;

                case 102:
                    preco = 1.50;
                    break;

                case 103:
                    preco = 1.20;
                    break;

                case 104:
                    preco = 1.30;
                    break;

                case 105:
                    preco = 1.00;
                    break;

                default:
                    preco = 0;
                    System.out.println("Codigo de produto invalido!");
            }

            if (preco > 0 && quantidade > 0) {
                valorProduto = preco * quantidade;
                valorTotal = valorTotal + valorProduto;

                System.out.printf("Valor deste produto: R$ %.2f%n",
                        valorProduto);
                System.out.printf("Total da compra ate agora: R$ %.2f%n",
                        valorTotal);
            } else if (preco > 0) {
                System.out.println("Quantidade invalida!");
            }

            System.out.println("Deseja continuar comprando? (S/N)");
            continuar = Character.toUpperCase(entrada.next().charAt(0));

        } while (continuar == 'S');

        System.out.printf("%nValor total da compra: R$ %.2f%n",
                valorTotal);

        System.out.println("Obrigado pela compra!");

        entrada.close();
    }
}
