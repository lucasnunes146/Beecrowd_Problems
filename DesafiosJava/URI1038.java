import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");
        entrada.close();

        int codProduto = Integer.parseInt(valores[0]);
        int qtdProduto = Integer.parseInt(valores[1]);

        double valorTotal = 0;

        if (codProduto == 1){ // cachorro-quente
            valorTotal = qtdProduto * 4.00;
        }
        else if (codProduto == 2){ // x-salada
            valorTotal = qtdProduto * 4.50;
        }
        else if (codProduto == 3){ // x-bacon
            valorTotal = qtdProduto * 5.00;
        }
        else if (codProduto == 4){ // torrada simples
            valorTotal = qtdProduto * 2.00;
        }
        else if (codProduto == 5){ // refrigerante
            valorTotal = qtdProduto * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n", valorTotal);
    }
}
