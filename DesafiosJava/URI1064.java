import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aux = 0; 
        double calculo = 0;
        double valores;
        for (int i = 0; i < 6; i++ ){
            valores = entrada.nextDouble();
            if(valores > 0){
                aux = aux + 1;
                calculo = calculo + valores; 
                }
        }
        System.out.println(aux+" valores positivos");
        System.out.printf("%.1f\n", calculo / aux);
        entrada.close();
    }
}
