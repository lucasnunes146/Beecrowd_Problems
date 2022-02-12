import java.util.Scanner;

public class URI1172 {
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner entrada = new Scanner(System.in);

        // entrada & processamento & saída
        int[] vetor = new int[10];
        
        for (int i = 0; i < 10; i++) {
            int x = (int) Integer.parseInt(entrada.nextLine());
            if (x <= 0){
                vetor[i] = 1;
            }
            else {
                vetor[i] = x;
            }
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
        entrada.close();
    }
}
