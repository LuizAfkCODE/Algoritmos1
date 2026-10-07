
//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor aqui eu tentei fazer um exercicio de aprovação de financiamento parece que o codigo está com erro mas quando da run ele funciona corretamente.
import java.util.Scanner;

public class TESTE300903 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in); 
        System.out.println("Qual o seu salario atual? ");
        double salario = entrada.nextDouble();
        System.out.println("Qual a sua idade atual? ");
        int idade = entrada.nextInt();
        System.out.println("Digite o valor da parcela que deseja: ");
        double parcela = entrada.nextDouble();

        if (idade >= 18 && parcela <= salario * 0.30) {
            System.out.println("Financiamento aprovado!");
    } else if (idade < 18) {
        System.out.println ("Financiamento negado: Idade minima não atingida");
    } else{
        System.out.println ("Financiamento negado! Parcela muito alta.");
    }

}

}