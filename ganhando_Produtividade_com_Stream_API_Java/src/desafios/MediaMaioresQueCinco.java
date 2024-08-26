package desafios;

import java.util.Arrays;
import java.util.List;

public class MediaMaioresQueCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maiores5 = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        Integer somaMaiores5 = maiores5.stream()
                .reduce(0, Integer::sum);

        System.out.println("A média dos números maiores que 5 é: " + somaMaiores5 / maiores5.size());
    }
}
