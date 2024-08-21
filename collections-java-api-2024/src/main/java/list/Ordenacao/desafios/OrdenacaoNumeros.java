package main.java.list.Ordenacao.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(this.listaNumeros);

        if (!listaNumeros.isEmpty()){
            Collections.sort(listaAscendente);
            return listaAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(listaNumeros);

        if (!listaNumeros.isEmpty()){
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

        ordenacaoNumeros.exibirNumeros();

    }
}
