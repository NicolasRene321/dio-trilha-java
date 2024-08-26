package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        // Cria uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usa a Stream API para encontrar o maior número primo
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(MaiorNumeroPrimo::ehPrimo) // Filtra os números primos
                .max(Integer::compareTo); // Encontra o maior número

        // Exibe o resultado no console
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo na lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Função para verificar se um número é primo
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
