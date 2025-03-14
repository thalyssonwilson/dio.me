package collections.set.ordenacao.exercicio1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> cadastroProdutosSET;

    public CadastroProdutos() {
        this.cadastroProdutosSET = new HashSet<>();
    }
    
    // adiciona um produto ao cadastro
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        cadastroProdutosSET.add(new Produto(nome, cod, preco, quantidade));
    }
    
    // exibe todos os produtos do cadastro em ordem alfabética pelo nome
    public void exibirProdutosPorNome(){
        Set<Produto> cadastrarProdutosPorNome = new TreeSet<>(cadastroProdutosSET);
        System.out.println("- - - EXIBIR PRODUTOS POR NOME - - -");
        for (Produto produto : cadastrarProdutosPorNome) {
            System.out.println("Produto: "+produto.getNome());
        }
    }
    // exibe todos os produtos do cadastro em ordem crescente de preço
    public void exibirProdutosPorPreco(){
        Set<Produto> cadastraProdutosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        cadastraProdutosPorPreco.addAll(cadastroProdutosSET);
        System.out.println("- - - EXIBIR PRODUTOS POR PREÇO - - -");
        for (Produto produto : cadastraProdutosPorPreco) {
            System.out.println("Preço: R$ "+produto.getPreco()+"   Produto: "+produto.getNome());
        }
    }
    
    



    public static void main(String[] args) {
        
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println("Adicionando elementos no SET ");
        cadastroProdutos.adicionarProduto(001, "blusa", 45.00, 1);
        cadastroProdutos.adicionarProduto(002, "casaco", 75.00, 3);
        cadastroProdutos.adicionarProduto(003, "bermuda", 35.00, 8);
        cadastroProdutos.adicionarProduto(004, "bermuda", 49.90, 10);
        cadastroProdutos.adicionarProduto(005, "terno", 299.00, 2);
        cadastroProdutos.adicionarProduto(006, "anel", 499.00, 10);
        cadastroProdutos.adicionarProduto(001, "piercing", 29.00, 100);
        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirProdutosPorPreco();





    }

}
