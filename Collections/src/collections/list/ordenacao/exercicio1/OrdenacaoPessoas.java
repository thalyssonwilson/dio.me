package collections.list.ordenacao.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // atributo do tipo List
    private List<Pessoa> listaDePessoas;


    // construtor cria um ArrayList
    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }


    // adiciona uma pessoa à lista
    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    // Ordena as pessoas da lista por idade usando a interface COMPARABLE
    // Para usar o Comparable é necessário implementar na classe base, neste caso, 'Pessoa'
    public void ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasOrdenadasPorIdade);
        for (Pessoa pessoa : pessoasOrdenadasPorIdade) {
            System.out.println("Nome: "+pessoa.getNome()+", Idade: "+pessoa.getIdade()+", Altura: "+pessoa.getAltura());
        }
    }
    // Ordena as pessoas da lista por altura usando um COMPARATOR personalizado
    // Para usar o Comparator é necessário criar uma classe
    public void ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
        for (Pessoa pessoa : pessoasOrdenadasPorAltura) {
            System.out.println("Nome: "+pessoa.getNome()+", Idade: "+pessoa.getIdade()+", Altura: "+pessoa.getAltura());
        }
    }


    // NÃO SOLICITADO: exibe as pessoas adicionadas na lista
    public void exibePessoasNaLista(){
        System.out.println();
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println("Nome: "+pessoa.getNome()+", Idade: "+pessoa.getIdade()+", Altura: "+pessoa.getAltura());
        }
    }


    public static void main(String[] args) {
        // cria uma instância da Classe OrdenacaoPessoas que é uma lista que contém obj Pessoa
        OrdenacaoPessoas pessoasOrdenadas = new OrdenacaoPessoas();
        
        System.out.println("* * Instânciando Pessoas ");
        pessoasOrdenadas.adicionarPessoa("Nome 1", 18, 1.57);
        pessoasOrdenadas.adicionarPessoa("Nome 2", 30, 1.80);
        pessoasOrdenadas.adicionarPessoa("Nome 3", 45, 1.75);
        pessoasOrdenadas.adicionarPessoa("Nome 4", 28, 1.60);
        pessoasOrdenadas.adicionarPessoa("Nome 5", 21, 1.82);
        pessoasOrdenadas.exibePessoasNaLista();

        System.out.println("\n* * * Ordenando Elementos da Lista pela idade com o Comparable()");
        pessoasOrdenadas.ordenarPorIdade();

        System.out.println("\n* * * Ordenando Elementos da Lista pela altura com o Comparator()");
        pessoasOrdenadas.ordenarPorAltura();
        
    }

}
