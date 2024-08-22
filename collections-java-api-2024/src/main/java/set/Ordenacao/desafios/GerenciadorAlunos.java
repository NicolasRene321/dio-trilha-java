package main.java.set.Ordenacao.desafios;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        if (!listaAlunos.isEmpty()){
            for (Aluno aluno: listaAlunos){
                if (aluno.getMatricula() == matricula){
                    listaAlunos.remove(aluno);
                }
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaAlunos);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(listaAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Marcos", 1245L, 7.5);
        gerenciadorAlunos.adicionarAluno("Albert", 1255L, 5.5);
        gerenciadorAlunos.adicionarAluno("Bernardo", 1265L, 9);

        System.out.println("Alunos por nome: " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(1245L);
        gerenciadorAlunos.exibirAlunos();
    }
}
