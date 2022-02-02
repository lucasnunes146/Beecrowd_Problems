import java.util.Scanner;

public  class URI1013{
    public static void main(String[] args) {
        //objeto
        Scanner entrada = new Scanner(System.in);

        //variáveis e entrada
        String[] valores = entrada.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        //processamento
        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c))/2;

        //saída
        System.out.println(maiorABC+" eh o maior");
        
        entrada.close();

    }
}