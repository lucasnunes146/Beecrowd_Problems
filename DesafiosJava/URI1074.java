import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        //objeto
        Scanner entrada = new Scanner(System.in);
        //variáveis e entrada
        int quantidade = entrada.nextInt();
        //processamento, entrada e saída
        for(int i = 0; i < quantidade; i++){
            int numero = entrada.nextInt();
            if (numero%2 == 0)
            {
                if (numero == 0)
                {
                    System.out.println("NULL");
                }
                else if (numero%2 == 0 && numero < 0)
                {
                    System.out.println("EVEN NEGATIVE");
                }
                else
                {
                    System.out.println("EVEN POSITIVE");
                }
            }
            else
            {
                if (numero%2 >= 1)
                {
                    System.out.println("ODD POSITIVE");
                }
                else if (numero%2 <= 1)
                {
                    System.out.println("ODD NEGATIVE");
                } 
            }
        }
        entrada.close();
    }
}
