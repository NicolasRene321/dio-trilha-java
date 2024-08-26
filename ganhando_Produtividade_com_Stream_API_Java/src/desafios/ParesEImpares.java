package desafios;

import java.util.Arrays;
import java.util.List;

public class ParesEImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> listaImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Número pares: " + listaPares);
        System.out.println("Número ímpares: " + listaImpares);
    }
}
