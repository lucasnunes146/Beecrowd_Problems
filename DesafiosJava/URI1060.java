package DesafiosJava;

import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int aux = 0; 
        for (int i = 0; i < 6; i++ ){
            Double valor = entrada.nextDouble();
            if(valor > 0){
                aux = aux + 1; 
            }
        }
        System.out.println( aux+" valores positivos");
        entrada.close();
    }
}