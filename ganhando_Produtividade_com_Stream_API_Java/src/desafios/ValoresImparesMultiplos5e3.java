package desafios;

import java.util.Arrays;
import java.util.List;

public class ValoresImparesMultiplos5e3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosImparesMultiplos5e3 = numeros.stream()
                .filter(n -> (n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)))
                .toList();

        System.out.println("Números ímpares que são múltiplos de 3 e 5: " + numerosImparesMultiplos5e3);
    }
}
