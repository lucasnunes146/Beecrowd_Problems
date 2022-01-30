package DesafiosJava;

import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias = entrada.nextInt();
        int ano = dias/365;
        dias = dias - (ano*365);
        int mes = dias/30;
        dias =  dias - (mes*30);
        int dia = dias;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

        entrada.close();
    }
}
