package desafios;

import java.util.Arrays;
import java.util.List;

public class NumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosDistintos = numeros.stream()
                .distinct() // Mantém apenas os elementos únicos
                .count() == numeros.size(); // Compara o tamanho da lista original com o tamanho dos elementos distintos

        if (numerosDistintos){
            System.out.println("Todos os números são distintos!");
        } else {
            System.out.println("Existem números iguais!");
        }
    }
}
