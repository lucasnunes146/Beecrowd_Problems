package DesafiosJava;

import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        double r, a, n = 3.14159;
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        a = n * Math.pow(r, 2);
        System.out.printf("A=%.4f\n",a);
        input.close();

    }
}
