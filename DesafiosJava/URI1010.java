import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        String prod;
        int qtd1, qtd2;
        double val_unid1, val_unid2, total;

        Scanner entrada = new Scanner(System.in);
        prod = entrada.nextLine();

        String[] valores = prod.split(" ");
        qtd1 = Integer.parseInt(valores[1]);
        val_unid1 = Double.parseDouble(valores[2]);

        prod = entrada.nextLine();
        valores = prod.split(" ");
        qtd2 = Integer.parseInt(valores[1]);
        val_unid2 = Double.parseDouble(valores[2]);

        total = (qtd1*val_unid1)+(qtd2*val_unid2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        entrada.close();
    }
}
