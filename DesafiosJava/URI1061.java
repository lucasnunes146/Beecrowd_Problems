package DesafiosJava;

import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valor1 = entrada.nextLine().split(" ");
        int diaInicio = Integer.parseInt(valor1[1]);

        String[] valor2 = entrada.nextLine().split(" : ");
        int horaInicio = Integer.parseInt(valor2[0]);
        int minInicio = Integer.parseInt(valor2[1]);
        int segInicio = Integer.parseInt(valor2[2]);

        String[] valor3 = entrada.nextLine().split(" ");
        int diaFim = Integer.parseInt(valor3[1]);

        String[] valor4 = entrada.nextLine().split(" : ");
        int horaFim = Integer.parseInt(valor4[0]);
        int minFim = Integer.parseInt(valor4[1]);
        int segFim = Integer.parseInt(valor4[2]);

        entrada.close();

        int momentoInicio = (diaInicio * 86400) + (horaInicio * 3600) + (minInicio * 60) + segInicio;
        int momentoFim = (diaFim * 86400) + (horaFim * 3600) + (minFim * 60) + segFim;

        int aux = (momentoFim - momentoInicio);
        int dias = aux / 86400;
        aux -= (dias * 86400);

        int horas = aux / 3600;
        aux -= (horas * 3600);

        int minutos = aux / 60;
        aux -= (minutos * 60);

        int segundos = aux;

        System.out.println(dias+" dia(s)");
        System.out.println(horas+" hora(s)");
        System.out.println(minutos+" minuto(s)");
        System.out.println(segundos+" segundo(s)");
    }
}
