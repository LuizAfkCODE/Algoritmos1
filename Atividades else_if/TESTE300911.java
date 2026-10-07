//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue atividade feita por mim de acordo com o exercicio anterior 13 onde é um sistema de reconhecimento do pagamento
import java.util.Scanner;

public class TESTE300911 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da sua compra?");
        double compra = entrada.nextDouble();
        System.out.println("Qual foi a forma de pagamento utilizada?");
        System.out.println("Para a forma de pagamento digite:");
        System.out.println("Dinheiro: D");
        System.out.println("Cartão: C");
        System.out.println("Pix: P");
        char pagamento = entrada.next().charAt(0);

        if (pagamento == 'D') {
            System.out.println("Seu desconto é de: ");
            if (compra > 100) {
                System.out.println("voce recebeu um desconto de 10%");
            } else {
                System.out.println("voce recebeu um desconto de 5%");
            }
        } else if (pagamento == 'C') {
            System.out.println("seu desconto é de: ");
            if (compra > 200) {
                System.out.println("voce recebeu um desconto de 5%");
            } else {
                System.out.println("voce nao recebeu descontos");
            }
        } else if (pagamento == 'P') {
            System.out.println("seu desconto é de: ");
            if (compra > 100) {
                System.out.println("voce recebeu um desconto de 15%");
            } else {
                System.out.println("voce recebeu um desconto de 8%");
            }
        } else {
            System.out.println("vc recebeu um desconto de 8%");
        }
    }
}


