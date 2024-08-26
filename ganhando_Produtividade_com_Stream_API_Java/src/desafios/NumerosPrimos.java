package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4);

        List<Integer> listaPrimos = numeros.stream()
                .filter(NumerosPrimos::ehPrimo)
                .toList();



        System.out.println("Números primos: " + listaPrimos);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se encontrar um divisor, o número não é primo
            }
        }
        return true; // Se não encontrar nenhum divisor, o número é primo
    }
}
