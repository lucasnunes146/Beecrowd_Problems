import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        //objeto
        Scanner entrada = new Scanner(System.in);

        //variáveis
        int qtdNumeros = entrada.nextInt();
        int auxIn = 0;
        int auxOut = 0;

        //processamento, nova entrada 
        for (int numeros=1; numeros <= qtdNumeros; numeros++){
            int numero = entrada.nextInt();
            if (numero >= 10 && numero <= 20)
            {
                auxIn++;
            }
            else
            {
                auxOut++;
            }
        }
        //saída
        System.out.println(auxIn+" in");
        System.out.println(auxOut+" out");
        entrada.close();
    }
}
