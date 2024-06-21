package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa i : tarefaList){
            if (i.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(i);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

   public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas na lista é " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Estudar");
        System.out.println("O numero total de tarefas na lista é " + listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas na lista é " + listaTarefa.obterNumeroTarefas());

        listaTarefa.obterDescricoesTarefas();
   }
}
