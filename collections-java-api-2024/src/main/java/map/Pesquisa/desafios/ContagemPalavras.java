package main.java.map.Pesquisa.desafios;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer maiorContagem = 0;
        if (!palavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry: palavrasMap.entrySet()){
                if (entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Moço", 52);
        contagemPalavras.adicionarPalavra("Moça", 62);
        contagemPalavras.adicionarPalavra("Senhora", 46);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("Moço");
        contagemPalavras.exibirContagemPalavras();

        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
