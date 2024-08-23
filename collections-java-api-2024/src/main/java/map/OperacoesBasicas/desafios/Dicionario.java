package main.java.map.OperacoesBasicas.desafios;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = null;
        if (!palavrasMap.isEmpty()){
            definicao = palavrasMap.get(palavra);
        }

        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Apreciar", "Ação que indica desfrutar de algo");
        dicionario.adicionarPalavra("Feliz", "Algo ou alguém com alegria");
        dicionario.adicionarPalavra("Audacioso", "Característica de alguém que é mais do que corajoso");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("Apreciar");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Audacioso"));

    }
}
