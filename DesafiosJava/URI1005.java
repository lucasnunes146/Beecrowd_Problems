package DesafiosJava;

import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        double a, b, media;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextDouble()*3.5;
        b = entrada.nextDouble()*7.5;
        media = (a+b) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
        entrada.close();
    }
}
