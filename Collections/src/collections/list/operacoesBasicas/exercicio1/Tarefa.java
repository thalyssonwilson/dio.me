package collections.list.operacoesBasicas.exercicio1;


public class Tarefa {
    // atributo
    private String descricao;

    
    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    

    // get
    public String getDescricao() {
        return descricao;
    }


    
    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 01 ");
        listaTarefas.adicionarTarefa("Tarefa 02 ");
        listaTarefas.adicionarTarefa("Tarefa 03 ");
        listaTarefas.adicionarTarefa("Tarefa 04 ");
        listaTarefas.adicionarTarefa("Tarefa 03 ");
        listaTarefas.adicionarTarefa("Tarefa 06 ");

        System.out.println("\n ------- a n t e s ------ ");
        listaTarefas.obterNumeroTotalTarefas();
        listaTarefas.obterDescricoesTarefas();

        System.out.println("\n* Removendo Tarefa pela descrição: Tarefa 03");
        listaTarefas.removerTarefa("Tarefa 03 ");
        
        System.out.println("\n ------- d e p o i s------ ");
        listaTarefas.obterNumeroTotalTarefas();
        listaTarefas.obterDescricoesTarefas();

    }











}
