package com.company;

public class Main {

    public static void main(String[] args) {
        int nt = 0, n, r = 0, nc = 0, p = 1;

        while (nt < 10) {
            n = (int) (Math.random() * 11);
            System.out.print("número " + (nc + 1) + " : " + n);
            if (n != 0) {
                r += n;
                p *= n;
                nt++;
                nc++;

                //manera corta de hacer if-else de una sola condicion
/*----------->*/String tipo = (n % 2 == 1) ? " : impar" : " : par"; //<----------------------------------!

                System.out.println(tipo);
            } else {
                System.out.println(" : está mal : cero");
            }
        }
        System.out.println("=============");
        System.err.println("resultado: " + r + "\n" + "la media : " + r / nt + "\n" + "producto : " + p);
    }
}
