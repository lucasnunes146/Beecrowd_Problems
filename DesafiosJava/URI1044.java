import java.util.Scanner;

public class URI1044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");
        entrada.close();

        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);

        if (a%b == 0 || b%a == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}