//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Exercicio 6
import java.util.Scanner;

public class TESTE290904 {
    public static void main (String [] args) {
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        double altura = entrada.nextDouble();
        System.out.println("Se você for do sexo Masculino digite a letra M");
        System.out.println("Se você for do sexo Feminino digite a letra F");
        char sexo = entrada.next().charAt(0);

        if (sexo == 'M') {
            System.out.println(72.7 * altura - 58);
        } else {
            System.out.println(62.1 * altura - 44.7);
        }
        entrada.close();
    }

}
