import java.util.Scanner;

public class URI1009 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        /* variaveis */
        Scanner scanner = new Scanner(System.in);
        Double salarioFixo, totalVendas, salarioFinal;

        /* entrada */
        scanner.nextLine();
        salarioFixo = scanner.nextDouble();
        totalVendas = scanner.nextDouble();

        /* processamento */
        salarioFinal = salarioFixo + totalVendas * 0.15;

        /* saida */
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}