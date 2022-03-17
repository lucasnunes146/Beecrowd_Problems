import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            lista.add(sc.nextInt());
        }

        System.out.printf("Menor valor: %d\n", Collections.min(lista));
        System.out.printf("Posicao: %d\n", lista.indexOf(Collections.min(lista)));
        sc.close();
    }

}
