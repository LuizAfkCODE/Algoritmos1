//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue exercicio similar ao exercicio 6 do qual fiz um calculo de quantas mililitros ou quantos litros baseado no seu peso voce deve consumir no dia.
import java.util.Scanner;

public class TESTE290905 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Se voce for Mulher digite a letra M");
        System.out.println("Se voce for Homem digite a letra H");
        char sexo = entrada.next().charAt(0);

        if (sexo == 'M') {
            System.out.println("O seu consumo ideal de agua é de:" + (peso * 30));
        } else {
            System.out.println("O seu consumo ideal de agua é de:" + (peso * 35));
        }
        entrada.close();
    }

}
