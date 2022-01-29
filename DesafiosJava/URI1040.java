import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");

        DecimalFormat decimalFormat = new DecimalFormat("#,#0.0");
        
        double nota1 = Double.parseDouble(valores[0])*2;
        double nota2 = Double.parseDouble(valores[1])*3;
        double nota3 = Double.parseDouble(valores[2])*4;
        double nota4 = Double.parseDouble(valores[3])*1;

        double media = (nota1+nota2+nota3+nota4)/10;

        System.out.println("Media: "+decimalFormat.format(media));

        if (media >= 7.0){
            
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if (media >=5.0 && media <=6.9){
            System.out.println("Aluno em exame.");
            double valores2 = entrada.nextDouble();
            System.out.println("Nota do exame: "+decimalFormat.format(valores2));
            double mediaFinal = (media+valores2)/2;

            if (mediaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            } 

            System.out.println("Media final: "+decimalFormat.format(mediaFinal));
        }

        entrada.close();         
    }
}
