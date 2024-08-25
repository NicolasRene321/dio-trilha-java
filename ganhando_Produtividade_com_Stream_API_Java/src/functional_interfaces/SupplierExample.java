package functional_interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
* Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente
* usada para criar ou fornecer novos objetos de um determinado tipo.
*/

public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações, com Expressão Lambda
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(3)
                .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}