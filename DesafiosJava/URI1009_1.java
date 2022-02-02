import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1009_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.next();
        double salario = entrada.nextDouble();
        double t_venda = entrada.nextDouble()*0.15;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00\n");
        decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
        System.out.println("TOTAL = R$ "+ decimalFormat.format(salario+t_venda));
        entrada.close();
    }
    
}
