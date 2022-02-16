import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        //objeto
        Scanner entrada = new Scanner(System.in);

        //variáveis
        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int somaImpares = 0;

        //processamento
        if (valor1 > valor2) {
			for (int i = valor1 - 1; i > valor2; i--) {
				if (i % 2 != 0) {
					somaImpares += i;
				}
			}
        }
        else {
            for (int i = valor2 - 1; i > valor1; i--) {
				if (i % 2 != 0) {
					somaImpares += i;
                }
            }
        }               
        System.out.println(somaImpares);

        entrada.close();
    }
}
