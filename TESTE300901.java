//Nome: Luiz Ricardo Soares Gouvea RA: 12526212259
// Professor segue um exercicio feito por mim seguindo a mesma logica do exercicio anterior 8, aqui eu acrescentei um usuario e senha como um sistema de login.
import java.util.Scanner;

public class TESTE300901 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o seu usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha = entrada.nextLine();

        if (usuario.equals("LuuiizAFKCode") && senha.equals("luuiiz61")) {
            System.out.println("Acesso concedido, seja bem vindo Luiz :D!");
        } else if (!usuario.equals("LuuiizAFKCode")) {
            System.out.println("Usuario ou senha invalido(a). Tente novamente!");
        } else {
            System.out.println("Senha invalida. Tente novamente!");
        }
        entrada.close();
    }

}
