package collections.map.operacoesBasicas.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatosComMAP;

    // construtor
    public AgendaContatos() {
        this.agendaContatosComMAP = new HashMap<>();
    }

    // Metodos
    // adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente
    public void adicionarContato(String nome, Integer telefone){
        agendaContatosComMAP.put(nome, telefone);
    }
    // remove um contato da agenda, dado o nome do contato
    public void removerContato(String nome){
        System.out.println("\n*  *  *    Removendo Contato    *  *  *");
        if(!agendaContatosComMAP.isEmpty()){ 
            agendaContatosComMAP.remove(nome);
            System.out.println("O contato "+nome+" foi removido!");
        }else{
            System.out.println("A agenda está vazia!");
        }
    }
    // exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato
    public void exibirContatos(){
        System.out.println("\n*  *  *    Todos os Contatos    *  *  *");
        // com arrow function
        agendaContatosComMAP.forEach((nome, telefone) ->{
            System.out.println("Nome: "+nome+"  Telefone: "+telefone);
        });

    }
    // pesquisa um contato pelo nome e retorna o número de telefone correspondente
    public void pesquisarPorNome(String nome){
        System.out.println("\n*  *  *    Pesquisa por Nome    *  *  *");
        if(!agendaContatosComMAP.isEmpty()){
            if(agendaContatosComMAP.containsKey(nome)){
                System.out.println("- Nome: "+nome+"  Telefone: "+agendaContatosComMAP.get(nome));
            }else{
                System.out.println("O nome '"+nome+"' não está na agenda!");
            }
        }else{
            System.out.println("A agenda está vazia!");
        }
    }

    


    public static void main(String[] args) {
        AgendaContatos agendaContatosMAP = new AgendaContatos();

        System.out.println("Adicionando contatos ao conjunto MAP..");
        agendaContatosMAP.adicionarContato("Zileide", 123456789);
        agendaContatosMAP.adicionarContato("Zulmira", 123345667);
        agendaContatosMAP.adicionarContato("Zoneide", 122333444);
        agendaContatosMAP.adicionarContato("Joao", 123321123);
        agendaContatosMAP.removerContato("Joao");
        agendaContatosMAP.exibirContatos();
        agendaContatosMAP.pesquisarPorNome("Joao");
    }
    
}
