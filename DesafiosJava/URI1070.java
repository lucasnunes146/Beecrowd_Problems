import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        // objeto 
        Scanner entrada = new Scanner(System.in);
        //variável
        int x = entrada.nextInt();
        //processamento
        for (int i = 0; i < 12; i++){
            if (x%2 != 0){
                //saída
                System.out.println(x);
            }
            x++;
        }
        entrada.close();
    }
}
