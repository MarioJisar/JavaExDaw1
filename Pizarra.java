import java.util.Scanner;

public class Pizarra {
    public static void main(String[] args) {
//        String nombre = "ABCDEFGHIJKLMN";
//        String letras = "ABCD";
//        System.out.println((nombre.replaceFirst(letras,"Z")));

        int num1 = 2016, num2 = 2020, diferencia = 0, diasTotales = 0, contYear, contYearB = 0, op = 0;

        if (num2 > num1) {
            diferencia = num2 - num1;
            diasTotales = diferencia * 365;
            System.out.println(diasTotales);
        }else if (num1 > num2){
            diferencia = num1 - num2;
            diasTotales = diferencia * 365;
            System.out.println(diasTotales);
        }else{
            System.out.println("0");
        }

        for(contYearB = 0; contYearB <= diferencia; contYearB++){
            if ((num1 % 4 == 0) && ((num1 % 100 != 0) || (num1 % 400 == 0))) {
                diasTotales = diasTotales + 1;
                System.out.println(diasTotales);
                num1++;
            }else {
                System.out.println(diasTotales);
                num1++;
            }
        }
    }
}
