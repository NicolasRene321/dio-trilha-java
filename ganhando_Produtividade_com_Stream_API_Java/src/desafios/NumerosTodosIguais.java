package desafios;

import java.util.Arrays;
import java.util.List;

public class NumerosTodosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 2, 2, 2);

        List<Integer> numerosTodosIguais = numeros.stream()
                .distinct()
                .toList();

        if (numerosTodosIguais.size() == 1){
            System.out.println("Todos os números são iguais!");
        } else {
            System.out.println("Nem todos os números são iguais!");
        }

    }
}
