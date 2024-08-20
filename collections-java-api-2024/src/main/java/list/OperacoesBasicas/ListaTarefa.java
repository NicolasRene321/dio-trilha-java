package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotalTarefas());

//        listTarefa.adicionarTarefa("Tarefa 1");
//        listTarefa.adicionarTarefa("Tarefa 1");
//        listTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotalTarefas());

        //listTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotalTarefas());

        listTarefa.obterDescricoesTarefas();
    }
}
