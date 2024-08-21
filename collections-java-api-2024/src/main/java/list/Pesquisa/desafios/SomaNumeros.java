package main.java.list.Pesquisa.desafios;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!listaInteiros.isEmpty()){
            for (Integer inteiro: listaInteiros){
                soma += inteiro;
            }
            return soma;
        } else {
            System.out.println("A lista está vazia!");
            return 0;
        }
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!listaInteiros.isEmpty()){
            for (Integer numero : listaInteiros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            System.out.println("A lista está vazia!");
            return 0;
        }
    }

    public int encontrarMenorNumero(){
        if (!listaInteiros.isEmpty()){
            int menorNumero = listaInteiros.get(1);
            for (Integer numero : listaInteiros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            System.out.println("A lista está vazia!");
            return 0;
        }
    }

    public List<Integer> exibirNumeros() {
        return listaInteiros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionar números a lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(2);

        System.out.println("Exibir números: " + somaNumeros.exibirNumeros());
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
