public class EXEMPLO02_WHILE {

    public static void main (String[] args) {

        int contador;
        contador = 0;
        int resto;

        while (contador <= 10) {
            resto = contador % 2;
            if (resto == 0) {
                System.out.println("o numero " + contador + " é par");
            }
            contador ++;
        } 
    }
}
