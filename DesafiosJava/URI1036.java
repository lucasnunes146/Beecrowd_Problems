import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] numeros = entrada.nextLine().split(" ");
        entrada.close();

        double a = Double.parseDouble(numeros[0]);
        double b = Double.parseDouble(numeros[1]);
        double c = Double.parseDouble(numeros[2]);

        double delta = Math.pow(b, 2) - 4 * a * c;

        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        if (delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);
        }
    }
}
