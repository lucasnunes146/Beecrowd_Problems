import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qtdTestes = sc.nextInt();
        

        for(int i = 0; i < qtdTestes; i++){
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < y){
                int aux = x;
                x = y;
                y = aux;
            }
            for(int j = y + 1; j < x; j++){
                if(j % 2 == 1) soma += j;
                }
            System.out.println(soma);
        }
        sc.close();
    }
}
