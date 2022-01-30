package DesafiosJava;

import java.util.Scanner;

public class URI1003 {
    public static void main(String[] args) {
        int a, b;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        b = entrada.nextInt();
        System.out.println("SOMA = "+ (a+b));
        entrada.close();
    }
}
