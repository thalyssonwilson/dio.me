package collections.set.pesquisa.exercicio02;

public class Tarefa {
    // atributos de tarefa
    private String descricao;
    private boolean statusTarefa;

    // construtor
    public Tarefa(String descricao, boolean statusTarefa) {
        this.descricao = descricao;
        this.statusTarefa = statusTarefa;
    }

    // GET
    public String getDescricao() {
        return descricao;
    }
    public boolean isStatusTarefa() {
        return statusTarefa;
    }

    // SET
    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    
    
    

}
