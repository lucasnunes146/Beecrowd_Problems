import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {
        // objeto
        Scanner entrada = new Scanner(System.in);

        // variáveis 
        int numero = entrada.nextInt();
        int aux = 0;
        entrada.close();
        //processamento
        for (int numeros = 1; numeros <= numero; numeros++){
            if (numeros%2 == 0){
                aux =(int) Math.pow(numeros, 2);
                //Saída
                System.out.println(numeros+"^2 = "+aux);
                aux++;
            }
        }
    }
}
