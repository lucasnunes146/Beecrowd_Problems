import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");
        entrada.close();

        double x = Double.parseDouble(valores[0]);
        double y = Double.parseDouble(valores[1]);

        if (x > 0 && y > 0){ //  Q1 (positivo) y (positivo)
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0){ //  Q4 (positivo) y (negativo)
            System.out.println("Q4");
        }
        else if (x < 0 && y > 0){ // Q2 x (negativo) y (positivo)
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){ // Q3 x (negativo) y (negativo)
            System.out.println("Q3");
        }
        else if (x == 0 && y == 0){ // Origem x (0) y (0)
            System.out.println("Origem");
        }
        else if (x == 0 && y < 0 || y > 0){ // Eixo Y x (0) y (+-)
            System.out.println("Eixo Y");
        }
        else if (y == 0 && x < 0 || x > 0){ // Eixo X x (+-) y (0)
            System.out.println("Eixo X");
        }
    }
}
