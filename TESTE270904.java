//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
//Professor essa atividade eu fiz como exemplo semelhante da qual voce aplicou no exercicio aplicando um if_else sobre dirigir
import java.util.Scanner;

public class TESTE270904 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Qual a sua idade? ");
        int idade = entrada.nextInt();

        if (idade >=18 ) {
            System.out.println ("Pode dirigir!");
    } else {
        System.out.println ("Não pode dirigir!");
    }
    entrada.close();
}
}
