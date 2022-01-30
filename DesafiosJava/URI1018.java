package DesafiosJava;

import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = entrada.nextInt();
        
        int cem = total/100;
        int cinquenta = (total%100)/50;
        int vinte = ((total%100)%50)/20;
        int dez = (((total%100)%50)%20)/10;
        int cinco = ((((total%100)%50)%20)%10)/5;
        int dois = (((((total%100)%50)%20)%10)%5)/2;
        int um = ((((((total%100)%50)%20)%10)%5)%2)/1;

        System.out.println(total);
        System.out.println(cem+" nota(s) de R$ 100,00");
        System.out.println(cinquenta+" nota(s) de R$ 50,00");
        System.out.println(vinte+" nota(s) de R$ 20,00");
        System.out.println(dez+" nota(s) de R$ 10,00");
        System.out.println(cinco+" nota(s) de R$ 5,00");
        System.out.println(dois+" nota(s) de R$ 2,00");
        System.out.println(um+" nota(s) de R$ 1,00");

        entrada.close();
    }
}
