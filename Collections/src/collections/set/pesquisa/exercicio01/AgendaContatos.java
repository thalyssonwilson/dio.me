package collections.set.pesquisa.exercicio01;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo Set do tipo Contato;
    Set<Contato> setDeContatos;

    // construtor cria um conjunto set com hashSet()
    public AgendaContatos() {
        this.setDeContatos = new HashSet<>();
    }

    // métodos
    // adiciona um contato à agenda
    public void adicionarContato(String nome, int numero){

        boolean adicionado = setDeContatos.add(new Contato(nome, numero));
        
        if(adicionado){
            System.out.println("Contato "+nome+" de telefone "+numero+" foi adicionado na agenda");
        }else{
            Contato contatoExistente = null;
            for (Contato c : setDeContatos) {
                if(c.getTelefone() == numero){
                    contatoExistente = c;
                    break;
                }
            }

            if(contatoExistente != null){
                System.out.println("Não foi possível adicionar o contato " + nome + ". O número " + numero +" já está atribuído ao contato " + contatoExistente.getNome());
            }
        }


        

    }
    // exibe todos os contatos da agenda
    public void exibirContatos(){
        System.out.println("* * *   * * *   Agenda de Contatos   * * *   * * *");
        for (Contato contatos : setDeContatos) {
            System.out.println("Nome: "+contatos.getNome()+"   Telefone: "+contatos.getTelefone());
        }
    }

    // Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados
    public void pesquisarPorNome(String nome){
        boolean verificador = false;
        for (Contato contato : setDeContatos) {
            if(contato.getNome().contains(nome)){
                System.out.println("Nome: "+contato.getNome()+"   Telefone: "+contato.getTelefone());
                verificador = true;
            }
        }
        if(verificador == false){
            System.out.println("Contato não está salvo na agenda de contatos");
        }

    }

    // Atualiza o número de telefone de um contato específico
    public void atualizarNumeroContato(String nome, int novoNumero){
        boolean verificador = false;
        for (Contato contato : setDeContatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novoNumero);      
                System.out.println("Contato de nome "+contato.getNome()+" teve o numero atualizado para "+contato.getTelefone());   
                verificador = true;
            }
        }
        if(verificador == false){
            System.out.println("Contato não existe na agenda de contatos");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // adiciona contatos na agenda.
        System.out.println("# Adicionando contatos na Agenda: ");
        agendaContatos.adicionarContato("Andre", 123456789);
        agendaContatos.adicionarContato("Andre", 123456789); // tentando salvar dois contatos com numeros iguais
        agendaContatos.adicionarContato("Andre", 101234567); // tentando salvar dois contatos com nomes iguais mas com numeros diferentes
        agendaContatos.adicionarContato("Andy", 123456789);  // tentando salvar dois contatos com nomes diferentes mas com numeros iguais
        agendaContatos.adicionarContato("Camila", 112233445);
        agendaContatos.adicionarContato("Daiane", 122134566);
        agendaContatos.adicionarContato("Daiane S", 192837465);
        agendaContatos.adicionarContato("Daiane T", 242433554);
        agendaContatos.adicionarContato("Pablito", 111119876);
        agendaContatos.adicionarContato("Sanchez", 998877665);
        System.out.println("\n# Exibir Agenda de Contatos:");
        // exibe os contatos da agenda
        agendaContatos.exibirContatos();

        // pesquisa por todo e qualquer contato que tenha Daiane na agenda
        System.out.println("\n# Pesquisar contato pelo nome Daiane");
        agendaContatos.pesquisarPorNome("Daiane");
        
        // pesquisa por um contato inexistente na agenda "Moana"
        System.out.println("\n# Pesquisar contato pelo nome Moana");
        agendaContatos.pesquisarPorNome("Moana");

        // atualiza um novo numero de contato para um contato existente na agenda
        System.out.println("\n# Atualizar o número do contato Sanchez");
        agendaContatos.atualizarNumeroContato("Sanchez", 909000003);

        // atualiza um novo numero de contato para um contato inexistente na agenda
        System.out.println("\n# Atualizar o número do contato Meneguel");
        agendaContatos.atualizarNumeroContato("Meneguel", 1100220033);

        // exibe os contatos da agenda
        System.out.println("\n# Lista de contatos depois de atualizada");
        agendaContatos.exibirContatos();




    }




}








