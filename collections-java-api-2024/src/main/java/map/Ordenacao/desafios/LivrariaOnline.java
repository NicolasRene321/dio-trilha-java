package main.java.map.Ordenacao.desafios;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosMap.put(link, new Livro(titulo,autor,preco));
    }

    public void removerLivro(String titulo){
        if (!livrosMap.isEmpty()){
            for (Map.Entry<String, Livro> entry: livrosMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livrosMap.remove(entry.getKey());
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry: livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosDoAutor = new HashMap<>();

        if (!livrosMap.isEmpty()){
            for (Map.Entry<String, Livro> entry: livrosMap.entrySet()){
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.put(entry.getKey(), entry.getValue());
                }
            }
        }

        return livrosDoAutor;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double precoMaisAlto = 0.0;

        if (!livrosMap.isEmpty()){
            for (Map.Entry<String, Livro> entry: livrosMap.entrySet()){
                if (entry.getValue().getPreco() > precoMaisAlto){
                    precoMaisAlto = entry.getValue().getPreco();
                    livroMaisCaro = entry.getValue();
                }
            }
        }

        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrosMap.isEmpty()){
            for (Map.Entry<String, Livro> entry: livrosMap.entrySet()){
                if (entry.getValue().getPreco() < precoMaisBaixo){
                    precoMaisBaixo = entry.getValue().getPreco();
                    livroMaisBarato = entry.getValue();
                }
            }
        }

        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("kanfkabfnka", "Dom Casmurro", "Machado de Assis", 20.00);
        livrariaOnline.adicionarLivro("sanfkgaksfnka", "O alienista", "Machado de Assis", 24.00);
        livrariaOnline.adicionarLivro("pafajdlabfnka", "O Alquimista", "Paulo Coelho", 12.00);
        livrariaOnline.adicionarLivro("jafajdlabfadja", "Era uma vez...", "Paulo Coelho", 10.00);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Machado de Assis"));
        livrariaOnline.removerLivro("Era uma vez...");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
    }
}
