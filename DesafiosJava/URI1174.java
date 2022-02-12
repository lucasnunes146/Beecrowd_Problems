import java.util.Scanner;

public class URI1174 {
    public static void main(String[] args){
        // variaveis & objetos
        Scanner entrada = new Scanner(System.in);

        // entrada & processamento & saída
        double[] vetor = new double[100];
        
        for (int i = 0; i < 100; i++) {
            Double a = entrada.nextDouble();
            if (a <= 10){
                vetor[i] = a;
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }
        entrada.close();
    }
}
