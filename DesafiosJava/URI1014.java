package DesafiosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        double y = entrada.nextDouble();
        double soma = x/y;
        DecimalFormat decimalFormat = new DecimalFormat("#,###0.000");
        System.out.println(decimalFormat.format(soma)+ " km/l");
        entrada.close();
    }
}
