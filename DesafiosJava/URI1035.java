package DesafiosJava;

import java.util.Scanner;

public class URI1035{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nInteiros = entrada.nextLine().split(" ");
        entrada.close();
        int a = Integer.parseInt(nInteiros[0]);
        int b = Integer.parseInt(nInteiros[1]);
        int c = Integer.parseInt(nInteiros[2]);
        int d = Integer.parseInt(nInteiros[3]);

        if (b > c && d > a && c+d > a+b && c > -1 && d > -1 && a%2 == 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}