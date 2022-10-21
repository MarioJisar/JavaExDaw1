import java.util.Scanner;

public class Pizarra {
    public static void main(String[] args) {
        int nota;
        String resultado;

        Scanner teclado = new Scanner(System.in);
        nota = teclado.nextInt();

        if(nota <= 10 && nota >= 0){
            if (nota >= 9){
                resultado = "Sobresaliente";
            } else if (nota >= 7){
                resultado = "Notable";
            } else if (nota >= 5){
                resultado = "Aprobado";
            } else {
                resultado = "Suspenso";
            }
            System.out.println(resultado);
        } else {
            System.out.println("Nota no válida");
        }
    }
}
