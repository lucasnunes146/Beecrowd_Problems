package DesafiosJava;

import java.util.Scanner;

public class URI1004 { // Beecrowd - Altere o nome da Classe para Main
    public static void main(String[] args) {
        int a, b;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        b = entrada.nextInt();
        System.out.println("PROD = "+ (a*b));
        entrada.close();
        
    }
}
