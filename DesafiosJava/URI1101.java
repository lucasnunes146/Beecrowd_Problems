import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, parada=1, aux, soma = 0;
		
		while (parada != 0){
			n = sc.nextInt();
			m = sc.nextInt();
			
			if (n <= 0 || m <= 0){
				parada = 0;
			}
			else {
				parada = 1;
				if (n > m){
					aux = n;
					n = m;
					m = aux;
				}
				for (int x = n; x <= m; x++){
					System.out.printf("%d ",x);
					soma = soma + x;
				}
				System.out.printf("Sum=%d\n",soma);
				soma = 0;
			}
		}
		sc.close();
    }
}
