package main.java.set.Pesquisa.desafios;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa tarefa1: tarefaSet){
            if (tarefa1.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(tarefa1);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa: tarefaSet){
                if (tarefa.getConcluida()){
                    tarefasConcluidas.add(tarefa);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa: tarefaSet){
                if (!tarefa.getConcluida()){
                    tarefasPendentes.add(tarefa);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa: tarefaSet){
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setConcluida(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa: tarefaSet){
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setConcluida(false);
                }
            }
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> tarefasRemover = new HashSet<>(tarefaSet);
        tarefaSet.removeAll(tarefasRemover);
        System.out.println("A lista de tarefas foi limpa!");
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Limpar pratos");
        listaTarefas.adicionarTarefa("Limpar fogão");
        listaTarefas.adicionarTarefa("Arrumar a mesa");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Varrer o chão");

        listaTarefas.exibirTarefas();
        System.out.println("A quantidade de tarefas é " + listaTarefas.contarTarefas());
        listaTarefas.removerTarefa("Arrumar a mesa");
        listaTarefas.marcarTarefaConcluida("Limpar fogão");
        listaTarefas.marcarTarefaConcluida("Lavar a louça");
        listaTarefas.marcarTarefaPendente("Lavar a louça");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.limparListaTarefas();
    }
    
}
