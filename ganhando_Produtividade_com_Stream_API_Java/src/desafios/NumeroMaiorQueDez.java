package desafios;

import java.util.Arrays;
import java.util.List;

public class NumeroMaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 5, 4, 3);

        boolean numeroMaiorQueDez = numeros.stream()
                .allMatch(n -> n <= 10);

        System.out.println("Existe número maior que 10? = " + !numeroMaiorQueDez);
    }
}
