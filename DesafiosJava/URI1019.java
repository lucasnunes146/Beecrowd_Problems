import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int segundos = entrada.nextInt();

        int hora = segundos/3600;
        segundos = segundos - (hora*3600);
        int minutos = segundos / 60;
        segundos = segundos - (minutos*60);
        int segundo = segundos;

        System.out.println(hora+ ":" + minutos+ ":" + segundo);

        entrada.close();
    }
}
