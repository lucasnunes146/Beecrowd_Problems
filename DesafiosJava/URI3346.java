import java.util.Scanner;

public class URI3346 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");

        double f1 = ((Double.parseDouble(valores[0]) / 100)+1);
        double f2 = ((Double.parseDouble(valores[1]) / 100)+1);

        double flutuacaoPib = ((f1 * f2) -1) * 100;

        System.out.printf("%.6f\n", flutuacaoPib);
        entrada.close();
    }
}
