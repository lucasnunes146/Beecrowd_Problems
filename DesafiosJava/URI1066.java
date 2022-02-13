import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        // objeto
        Scanner br = new Scanner(System.in);

        // variáveis
        int negativo = 0;
        int positivo = 0;
        int par = 0;
        int impar = 0;

        // processamento
        for (int i = 0; i < 5; i++){
            // entrada
            int valor = br.nextInt(); 
            
            if (valor % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
            if (valor > 0){
                positivo++;
            }
            else if (valor < 0){
                negativo++;
            } 
        }
        //saída
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);

        br.close();
    }
}
