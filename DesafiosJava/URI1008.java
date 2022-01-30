package DesafiosJava;

import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        int n_funcionario, horas;
        float q_horas;
        Scanner entrada = new Scanner(System.in);
        n_funcionario = entrada.nextInt();
        horas = entrada.nextInt();
        q_horas = entrada.nextFloat();
        System.out.println("NUMBER = "+ n_funcionario);
        System.out.printf("SALARY = U$ %.2f\n",horas*q_horas);
        entrada.close();
    }
}
