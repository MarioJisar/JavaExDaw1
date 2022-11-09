import java.util.Scanner;

public class fomulario {
    public static void main(String[] args) {
        int col, row, col1, row1;
        String[] arr = {"+", "*"};
        Scanner teclado = new Scanner(System.in);
        col1 = teclado.nextInt();
        row1 = teclado.nextInt();

        for (row = 0; row < row1; row++){
            for(col = 0; col < col1; col++) {
                System.out.print(arr[0]);
                for(col=1; col < col1-1;col++){
                    System.out.print(arr[1]);
                }
                System.out.println(arr[0]);
            }
        }
    }
}
