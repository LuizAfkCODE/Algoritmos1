//Exercicio 5 do switch
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
import java.util.Scanner;

public class TESTE051009 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();
        System.out.println("Selecione a opção que deseja seguindo as teclas:");
        System.out.println("M - média entre os números digitados ");
        System.out.println("S - diferença do maior pelo menor");
        System.out.println("P - produto entre os números digitados");
        System.out.println("D - divisão do primeiro pelo segundo");
        char opcao = Character.toUpperCase(entrada.next().charAt(0));

        switch (opcao) {

            case 'M':
                System.out.println("A media entre os numeros são: " + (numero1 + numero2) / 2);
                break;
            case 'S':
                if (numero1 > numero2) {
                    System.out.println("A diferença entre um e outro é: " + (numero1 - numero2));
                } else {
                    System.out.println("A diferença entre um e outro é: " + (numero2 - numero1));
                }
                break;
            case 'P':
                System.out.println("O produto entre os numeros digitados são: " + (numero1 * numero2));
                break;
            case 'D':
                System.out.println("A divisão do primeiro pelo segundo é: " + (numero1 / numero2));
                break;
        default:
            System.out.println("Digite uma tecla valida entre as opções.");
        }
    }
 
}
