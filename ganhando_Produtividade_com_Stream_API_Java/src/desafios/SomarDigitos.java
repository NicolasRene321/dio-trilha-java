package desafios;

import java.util.Arrays;
import java.util.List;

public class SomarDigitos {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 51, 4, 3);

        int somaDigitos = numeros.stream()
                .map(String::valueOf) // Transforma cada número em String
                .flatMapToInt(String::chars) // Quebra cada String em seus caracteres
                .map(Character::getNumericValue) // Tranforma cada caractere (dígito) em número de volta
                .reduce(0, Integer::sum);


        System.out.println("A soma de todos os dígitos é: " + somaDigitos);
    }
}
