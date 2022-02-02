import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();
        entrada.close();

        double reajusteGanho;
        int percentual; 
        double novoSalario;

        if (salario >= 0 && salario <= 400.00){
            percentual = 15;
            reajusteGanho = salario * 0.15;
            novoSalario = salario + reajusteGanho;
        }
        else if (salario > 400.00 && salario <= 800.00){
            percentual = 12;
            reajusteGanho = salario * 0.12;
            novoSalario = salario + reajusteGanho;
        }
        else if (salario > 800.00 && salario <= 1200.00){
            percentual = 10;
            reajusteGanho = salario * 0.1;
            novoSalario = salario + reajusteGanho;
        }
        else if (salario > 1200.00 && salario <= 2000.00){
            percentual = 7;
            reajusteGanho = salario * 0.07;
            novoSalario = salario + reajusteGanho;
        }
        else{
            percentual = 4;
            reajusteGanho = salario * 0.04;
            novoSalario = salario + reajusteGanho;
        }
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.println("Em percentual: " +  percentual + " %");
    }
}