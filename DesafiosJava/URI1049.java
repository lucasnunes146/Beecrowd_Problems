package DesafiosJava;

import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String subfilo = entrada.nextLine();
        String classe = entrada.nextLine();
        String ordem = entrada.nextLine();

        if (subfilo.equals("vertebrado") && classe.equals("ave")  && ordem.equals("carnivoro") ){
            System.out.println("aguia");
        }
        else if (subfilo.equals("vertebrado") && classe.equals("ave") && ordem.equals("onivoro")){
            System.out.println("pomba");
        }
        else if (subfilo.equals("vertebrado") && classe.equals("mamifero") && ordem.equals("onivoro")){
            System.out.println("homem");
        }
        else if (subfilo.equals("vertebrado") && classe.equals("mamifero") && ordem.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if (subfilo.equals("invertebrado") && classe.equals("inseto") && ordem.equals("hematofago")){
            System.out.println("pulga");
        }
        else if (subfilo.equals("invertebrado") && classe.equals("inseto") && ordem.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if (subfilo.equals("invertebrado") && classe.equals("anelideo") && ordem.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (subfilo.equals("invertebrado") && classe.equals("anelideo") && ordem.equals("onivoro")){
            System.out.println("minhoca");
        }
        entrada.close();
    }
}
