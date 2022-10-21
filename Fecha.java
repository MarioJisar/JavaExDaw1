import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int day, month, year;
        String valido;

        System.out.println("Inicio programa" + "\n" + "Introduce un año");
        year = kb.nextInt();

        if(year>=2001 && year <=2100){
            System.out.println("Introduce un mes");
            month = kb.nextInt();
            if(month >= 1 && month <= 12){
                switch(month){
                    case 1 :
                    case 3 :
                    case 5 :
                    case 7 :
                    case 8 :
                    case 10 :
                    case 12 : System.out.println("Introduce un dia");day = kb.nextInt(); valido = (day >= 1 && day <= 31) ? "Fecha correcta" : "Fecha incorrecta";
                        System.out.println(valido);break;
                    case 4 :
                    case 6 :
                    case 9 :
                    case 11 : System.out.println("Introduce un dia");day = kb.nextInt(); valido = (day >= 1 && day <= 30) ? "Fecha correcta" : "Fecha incorrecta";
                        System.out.println(valido);break;
                    case 2 : System.out.println("Introduce un dia");day = kb.nextInt(); valido = (day >= 1 && day <= 28) ? "Fecha correcta" : "Fecha incorrecta";
                        System.out.println(valido);break;
                }
            }else{
                System.err.println("Mes introducido incorrecto");
            }
        }else{
            System.err.println("Año introducido incorrecto");
        }
    }
}
