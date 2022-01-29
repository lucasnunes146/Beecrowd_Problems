import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        String p;
        Double x1, x2, y1, y2, distancia;

        Scanner entrada = new Scanner(System.in);
        
        p = entrada.nextLine();
        String[] valores = p.split(" ");
        x1 = Double.parseDouble(valores[0]);
        y1 = Double.parseDouble(valores[1]);

        p = entrada.nextLine();
        valores = p.split(" ");
        x2 = Double.parseDouble(valores[0]);
        y2 = Double.parseDouble(valores[1]);

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        DecimalFormat decimalFormat = new DecimalFormat("#,####0.0000");
        System.out.println(decimalFormat.format(distancia));

        entrada.close();
    }
}
