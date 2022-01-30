package DesafiosJava;

import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas = entrada.nextInt();
        int velocidade = entrada.nextInt();
        double calculo = horas * velocidade;
        double litros = calculo/12;
        System.out.printf("%.3f\n", litros);
        entrada.close();
    }
}
