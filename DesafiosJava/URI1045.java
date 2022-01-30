package DesafiosJava;

import java.util.Arrays;
import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");

        float[] numeros = new float[3];

        for (int i = 0; i < 3; i++){
            numeros[i] = Float.parseFloat(valores[i]);
        }

        Arrays.sort(numeros);
        entrada.close();

        double a = numeros[2];
        double b = numeros[1];
        double c = numeros[0];

        if (a >= (b + c)) {
            System.out.print("NAO FORMA TRIANGULO\n");

        } else if (a * a > ((b * b) + (c * c))) {
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (a * a == ((b * b) + (c * c))) {
            System.out.print("TRIANGULO RETANGULO\n");
        }

        if (a * a < ((b * b) + (c * c))) {
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((a == c) && (a == c)) {
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a))) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }
    }
}
