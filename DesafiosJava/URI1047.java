import java.util.Scanner;

public class URI1047{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] valores = entrada.nextLine().split(" ");
        entrada.close();
        int horaIni = Integer.parseInt(valores[0]);
        int minIni = Integer.parseInt(valores[1]);
        int horaFim = Integer.parseInt(valores[2]);
        int minFim = Integer.parseInt(valores[3]);

        int tempoEmMinutosInicio = horaIni * 60 + minIni;
        int tempoEmMinutosFim = horaFim * 60 + minFim;
        int duracaoJogo;

        if (tempoEmMinutosFim <= tempoEmMinutosInicio){
            duracaoJogo = (24 * 60 - tempoEmMinutosInicio) + tempoEmMinutosFim;
        }
        else {
            duracaoJogo = tempoEmMinutosFim - tempoEmMinutosInicio;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n ", duracaoJogo/60, duracaoJogo%60);
    }
}