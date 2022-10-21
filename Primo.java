import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador , I, numero;
        System.out.println("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();

        contador = 0;
        for(I = 1; I <= numero; I++) {
            if ((numero % I) == 0) {
                contador++;
            }
        }
            if (contador <= 2) {
                System.out.println("si");
            } else {
                System.out.println("no");
            }
    }
}
