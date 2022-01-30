package DesafiosJava;

import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");
        entrada.close();

        int horaInicial = Integer.parseInt(valores[0]);
        int horaFim = Integer.parseInt(valores[1]);
        int duracaoJogo;
        
        if (horaFim <= horaInicial){
            duracaoJogo = (24 - horaInicial) + horaFim;
            
        }
        else{
            duracaoJogo = horaFim - horaInicial;
        }  
        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
    }
}
