package DesafiosJava;

import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");
        entrada.close();

        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        double perimetro = a+b+c;
        double area = ((a+b)*c)/2;

        if (a < b + c && b < a + c && c < a + b){
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } 
        else{
            System.out.printf("Area = %.1f\n", area);
        }  
    }
}
