import java.util.Scanner;

public class URI1075 {
    public static void main(String[] args) 
    {   //objetos
        Scanner entrada = new Scanner(System.in);

        //variáveis
        int divisor = entrada.nextInt();

        //processamento e saída
        for (int i = 1; i < 10000; i++)
        {
            if (i%divisor == 2)
            {
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
