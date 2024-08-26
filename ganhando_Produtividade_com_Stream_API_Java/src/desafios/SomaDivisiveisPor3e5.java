package desafios;

import java.util.Arrays;
import java.util.List;

public class SomaDivisiveisPor3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 45);

        int somaDivisiveisPor3e5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + somaDivisiveisPor3e5);
    }
}
