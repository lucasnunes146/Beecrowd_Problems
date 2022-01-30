package DesafiosJava;

import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double volume, pi = 3.14159;
        double raio = entrada.nextDouble();
        volume = (4.0/3)*pi* Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
        entrada.close();
    }
}
