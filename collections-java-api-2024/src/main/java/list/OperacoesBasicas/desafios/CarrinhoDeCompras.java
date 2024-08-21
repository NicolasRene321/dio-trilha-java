package main.java.list.OperacoesBasicas.desafios;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaItensRemover = new ArrayList<>();

        for (Item item: listaItens){
            if (item.getNome().equalsIgnoreCase(nome)){
                listaItensRemover.add(item);
            }
        }

        listaItens.removeAll(listaItensRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (int i = 0; i < listaItens.size(); i++){
             valorTotal += (listaItens.get(i).getQuantidade() * listaItens.get(i).getPreco());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 12.00, 5);
        carrinhoDeCompras.adicionarItem("Feijão", 12.00, 9);
        carrinhoDeCompras.adicionarItem("Feijão", 12.00, 4);
        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }
}
