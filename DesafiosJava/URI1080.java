import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        //objetos
        Scanner sc = new Scanner(System.in);
        int[] numerosAleatorios = new int[100];
        // variáveis
        int maior = 0, posicao = 0;
        //processamento
        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = sc.nextInt();
            numerosAleatorios[i] = numero;
            if (numerosAleatorios[i] > maior){
                maior = numerosAleatorios[i];
                posicao = i;
            }
        }
        //saídas
        System.out.println(maior);
        System.out.println(posicao+1);
        sc.close();
    }
}