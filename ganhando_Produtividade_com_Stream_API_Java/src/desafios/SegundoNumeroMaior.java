package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SegundoNumeroMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoNumeroMaior = numeros.stream()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst();

        System.out.println("O segundo número maior da lista é: " + segundoNumeroMaior.get());
    }
}
