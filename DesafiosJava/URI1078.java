import java.util.Scanner;

public class URI1078 
{
    public static void main(String[] args) 
    {   //objetos
        Scanner entrada = new Scanner(System.in);

        //variáveis
        int n = entrada.nextInt();

        entrada.close();
        //processamento e saída
        for (int i = 1; i <= 10; i++)
        {
            int resultado = i * n;
            System.out.println(i+" x "+n+" = "+resultado);
        }
    }
}
