package collections.list.operacoesBasicas.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo List
    private List<Tarefa> tarefaList;



    
    // este construtor não recebe uma lista, ele cria uma lista vazia;
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    

    // metodos

    // adiciona uma tarefa em uma LISTA DE TAREFAS
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));

    }
    
    // remove uma tarefa em uma LISTA DE TAREFAS
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);

    }

    // mostra a quantidade de tarefas adicionas na lista.
    public void obterNumeroTotalTarefas(){
        System.out.println("Quantidade total de tarefas: "+tarefaList.size());

    }


    // mostra a descrição de todas as tarefas adicionas na lista.
    public void obterDescricoesTarefas(){
        for (Tarefa tarefa : tarefaList) {
            System.out.println("N°: "+(tarefaList.indexOf(tarefa)+1)+"  |  Descrição: "+tarefa.getDescricao());
        }
    }






}
