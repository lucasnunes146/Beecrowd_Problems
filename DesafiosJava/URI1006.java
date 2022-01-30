package DesafiosJava;

import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        double a, b, c, media;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextDouble()*2;
        b = entrada.nextDouble()*3;
        c = entrada.nextDouble()*5;
        media = (a+b+c) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
        entrada.close();

    }
}
