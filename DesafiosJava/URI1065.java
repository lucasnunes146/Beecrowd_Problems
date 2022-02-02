import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int valores;
        for (int i = 0; i < 5; i++){
            valores = entrada.nextInt();
            if (valores % 2 == 0){
                contador ++;
            }
        }
        System.out.println(contador+ " valores pares");
        entrada.close();
    }
}
