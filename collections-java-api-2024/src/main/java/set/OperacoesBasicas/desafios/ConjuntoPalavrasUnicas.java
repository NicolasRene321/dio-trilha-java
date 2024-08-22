package main.java.set.OperacoesBasicas.desafios;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        if (!palavrasSet.isEmpty()){
            for (String palavra1: palavrasSet){
                if (palavra1.equalsIgnoreCase(palavra)){
                    System.out.println("A palavra " + palavra1 + " está presente!");
                    break;
                }
            }

        } else {
            throw new RuntimeException("O Set está vazio!");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Xablau");
        conjuntoPalavrasUnicas.adicionarPalavra("Bacana");
        conjuntoPalavrasUnicas.adicionarPalavra("Mamão");
        conjuntoPalavrasUnicas.adicionarPalavra("Eita");
        conjuntoPalavrasUnicas.adicionarPalavra("Poxa");

        conjuntoPalavrasUnicas.removerPalavra("Eita");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Poxa");
    }
}
