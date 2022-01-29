import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] numeros = entrada.nextLine().split(" ");
        entrada.close();

        int n1 = Integer.parseInt(numeros[0]);
        int n2 = Integer.parseInt(numeros[1]);
        int n3 = Integer.parseInt(numeros[2]);
        
        if (n1 < n2 && n1 < n3){
            if (n2 < n3){
                System.out.printf("%d\n%d\n%d\n\n", n1, n2, n3);
            }
            else{
                System.out.printf("%d\n%d\n%d\n\n", n1, n3, n2);
            }
        }
        if (n2 < n1 && n2 < n3){
            if (n1 < n3){
                System.out.printf("%d\n%d\n%d\n\n", n2, n1, n3);
            }
            else{
                System.out.printf("%d\n%d\n%d\n\n", n2, n3, n1);
            } 
        }
        if (n3 < n1 && n3 < n2){
            if (n1 < n2){
                System.out.printf("%d\n%d\n%d\n\n", n3, n1, n2);
            }
            else{
                System.out.printf("%d\n%d\n%d\n\n", n3, n2, n1);
            }
        }
        System.out.printf("%d\n%d\n%d\n", n1, n2, n3);
    }
}
