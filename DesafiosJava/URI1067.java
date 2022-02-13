import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        // objeto
        Scanner entrada = new Scanner(System.in);

        // variáveis e entrada
        int x = entrada.nextInt();

        // processamento
        for (int i = 1; i <= x; i++){ 
            if (i%2 == 1){
                //saída
                System.out.println(i); 
            } 
        }
        entrada.close();
    }
}
