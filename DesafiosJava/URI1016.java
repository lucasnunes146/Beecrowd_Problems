package DesafiosJava;

import java.util.Scanner;

public class URI1016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int km = entrada.nextInt();
        int calculo = (60 * km) / 30;
        System.out.println(calculo+" minutos");
        entrada.close();
    }
}
