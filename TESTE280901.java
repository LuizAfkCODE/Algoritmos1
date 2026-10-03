//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor este é um exemplo feito por mim com a mesma pegada do exercicio que voce passou que lê a temperatura e da a recomendação do clima se está quente ou nao.
import java.util.Scanner;

public class TESTE280901 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a temperatura? ");
        double temperatura = entrada.nextDouble();

        if (temperatura > 25) {
            System.out.println("Está quente!");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está agradavel!");
        }else {
            System.out.println ("Está frio");
        }
        entrada.close();
    }

}
