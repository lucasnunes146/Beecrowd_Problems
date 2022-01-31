package DesafiosJava;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1051{
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        double renda = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        if (renda >= 0 && renda <= 2000){
            System.out.println("Isento");
        }
        else if (renda > 2000 && renda <= 3000){
            double calculo = (renda - 2000) * 0.08;
            System.out.println("R$ "+df.format((calculo)));
        }
        else if (renda > 3000 && renda <= 4500){
            double calculo = 1000 *0.08;
            calculo += (renda - 3000) *0.18;
            System.out.println("R$ "+df.format(calculo));
        }
        else{
            double calculo = 1000*0.08;
            calculo += 1500 * 0.18;
            calculo += (renda - 4500) * 0.28;
            System.out.println("R$ "+df.format(calculo));
        }
        entrada.close();
    }
}