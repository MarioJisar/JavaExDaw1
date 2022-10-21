package com.company;

public class Argumentos {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String c = (args[2]);
        System.out.println(a);
        System.out.println(b);

        if (c.equalsIgnoreCase("suma"));
        System.out.println("suma : " + (a+b));
        if (c.equalsIgnoreCase("mult"));
        System.out.println("mult : " + (a*b));
        if (c.equalsIgnoreCase("divi"));
        System.out.println("divi : " + (a/b));
        if (c.equalsIgnoreCase("rest"));
        System.out.println("rest : " + (a-b));

//        int num = Integer.parseInt(args[0]);
//        while (num >= 0){
//            System.out.println(num);
//            num--;
//        }

    }

}
