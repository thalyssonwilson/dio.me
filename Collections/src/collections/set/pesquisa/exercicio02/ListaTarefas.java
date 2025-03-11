package collections.set.pesquisa.exercicio02;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    //metodos
    // adiciona uma nova tarefa ao Set
    public void adicionarTarefa(String descricao){
        conjuntoTarefas.add(new Tarefa(descricao, false));
        System.out.println("Tarefa adicionada: "+descricao);
    }
    // remove uma tarefa do Set de acordo com a descrição, se estiver presente
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null; 
        for (Tarefa tarefa : conjuntoTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = tarefa;
                System.out.println("Tarefa removida com sucesso!");
            }
        }
        conjuntoTarefas.remove(tarefaParaRemover);
    }
    // exibe todas as tarefas da lista de tarefas
    public void exibirTarefas(){
        System.out.println("*  *   *  Todas as Tarefas  *   *  *");
        for (Tarefa t : conjuntoTarefas) {
            System.out.println("---> Tarefa: "+t.getDescricao()+"   Status: "+t.isStatusTarefa());
        }
    }
    // conta o número total de tarefas na lista de tarefas
    public void contarTarefas(){
        System.out.println("Quantidade de tarefas na lista: "+conjuntoTarefas.size());
    }
    // retorna um Set com as tarefas concluídas
    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if(t.isStatusTarefa()==true){
                tarefasConcluidas.add(t);
            }
        }
        for (Tarefa tarefa : tarefasConcluidas) {
            System.out.println("Descrição "+tarefa.getDescricao()+"   Status: "+tarefa.isStatusTarefa());
        }

    }
    // retorna um Set com as tarefas pendentes
    public void obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if(t.isStatusTarefa() == false){
                tarefasPendentes.add(t);
            }
        }
        for (Tarefa tarefa : tarefasPendentes) {
            System.out.println("Descrição "+tarefa.getDescricao()+"   Status: "+tarefa.isStatusTarefa());
        }
    }
    // marca uma tarefa como concluída de acordo com a descrição
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : conjuntoTarefas) {
            if(descricao.equalsIgnoreCase(t.getDescricao())){
                t.setStatusTarefa(true);
            }
        }
    }
    // marca uma tarefa como pendente de acordo com a descrição
    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : conjuntoTarefas) {
            if(descricao.equalsIgnoreCase(t.getDescricao())){
                t.setStatusTarefa(false);
            }
        }
    }
    // remove todas as tarefas da lista de tarefas
    public void limparListaTarefas(){
        conjuntoTarefas.clear();
        System.out.println("Agora a lista está vazia");
    }


    public static void main(String[] args) {

        ListaTarefas conjuntoTarefasSet = new ListaTarefas();

        System.out.println("->   Adicionando Tarefas: ");
        conjuntoTarefasSet.adicionarTarefa("Descrição 01");
        conjuntoTarefasSet.adicionarTarefa("Descrição 02");
        conjuntoTarefasSet.adicionarTarefa("Descrição 03");
        conjuntoTarefasSet.adicionarTarefa("Descrição 04");
        conjuntoTarefasSet.adicionarTarefa("Descrição 05");
        conjuntoTarefasSet.exibirTarefas();

        System.out.println("\n->   Total de tarefas: ");
        conjuntoTarefasSet.contarTarefas();

        System.out.println("\n->   Marcar a tarefa [Descrição 03] como concluida: ");
        conjuntoTarefasSet.marcarTarefaConcluida("Descrição 03");
        conjuntoTarefasSet.exibirTarefas();

        System.out.println("\n->   Remover tarefa [Descrição 04]");
        conjuntoTarefasSet.removerTarefa("Descrição 04");

        System.out.println("\n->   Total de tarefas atualizadas: ");
        conjuntoTarefasSet.exibirTarefas();
        
        System.out.println("\n->   Obter tarefas pendentes");
        conjuntoTarefasSet.obterTarefasPendentes();
        
        System.out.println("\n->   Obter tarefas concluidas");
        conjuntoTarefasSet.obterTarefasConcluidas();
        
        System.out.println("\n->   Limpar a lista de tarefas");
        conjuntoTarefasSet.limparListaTarefas();
    }






}



