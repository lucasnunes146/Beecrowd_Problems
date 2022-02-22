import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1079 {

    public static void main(String[] args) throws IOException {
        // objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //variáveis
        int totalTestes = Integer.parseInt(br.readLine());
        
        //processamento 
        for (int teste = 0; teste < totalTestes; teste++){
            //entrada e variáveis
            String[] valores = br.readLine().split(" ");

            double valor1 = Double.parseDouble(valores[0]);
            double valor2 = Double.parseDouble(valores[1]);
            double valor3 = Double.parseDouble(valores[2]);

            valor1 = valor1*2;
            valor2 = valor2*3;
            valor3 = valor3*5;

            double media = (valor1+valor2+valor3)/10;

            System.out.printf("%.1f\n", media);
        }
        br.close();
    }
}
