package com.company;

import java.util.Scanner;

public class Character2 {
    public static void main(String[] args){
        char letra;
        int contador, cont=0, codigo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas letras querés??");
        contador = teclado.nextInt();
        while(cont<contador) {
            System.out.println("Introduce un carácter: ");
            letra = teclado.next().charAt(0);
            codigo = letra;
            System.out.println("----------> " + letra + " <---------" + "\n" + "Su código ASCII es : " + codigo);
            if ((codigo >= 65 && codigo <= 90) || codigo == 199) {
                System.out.println("La letra es mayúscula");
            } else if ((codigo >= 97 && codigo <= 122) || codigo == 231) {
                System.out.println("La letra es minuscula");
            } else if (codigo >= 48 && codigo <= 57) {
                System.out.println("El carácter es un número");
            } else {
                System.out.println("No válido");
            }
            cont++;
        }
        }
}
