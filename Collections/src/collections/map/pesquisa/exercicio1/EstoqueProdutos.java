package collections.map.pesquisa.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueDeProdutosMAP;

    public EstoqueProdutos() {
        this.estoqueDeProdutosMAP = new HashMap<>();
    }

    
    // métodos
    // Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueDeProdutosMAP.put(cod, new Produto(nome, quantidade, preco));
    }
    
    // Exibe todos os produtos, suas quantidades em estoque e preços.
    public void exibirProdutos(){
        System.out.println("\n-- -- -- -- -- --   E  S  T  O  Q  U  E   -- -- -- -- --");
        for(Map.Entry<Long, Produto> produtos : estoqueDeProdutosMAP.entrySet()){
            System.out.println("Nome: "+produtos.getValue().getNome()+"   Quantidade: "+produtos.getValue().getQuantidade()+"   Preço: R$ "+produtos.getValue().getPreco());
        }
        
    }
   
    // Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public void calcularValorTotalEstoque(){
        double valorTotal = 0.0;
        double valorTemporario = 0.0;
        int quantidade;
        double preco;

        for(Map.Entry<Long, Produto> produtos : estoqueDeProdutosMAP.entrySet()){
            quantidade = produtos.getValue().getQuantidade();
            preco = produtos.getValue().getPreco();
            valorTemporario = quantidade * preco;
            valorTotal = valorTotal + valorTemporario;
        }
        System.out.println("      Valor Total R$ "+valorTotal);

    }
    
    // Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public void obterProdutoMaisCaro(){
        System.out.println("\n-- -- -- -- -- --    PRODUTO MAIS CARO    -- -- -- --");
        double maiorPreco = 0.0;   
        Produto produtoMaisCaro = null;

        for (Map.Entry<Long, Produto> p : estoqueDeProdutosMAP.entrySet()) {
            if (p.getValue().getPreco()>maiorPreco) {
                maiorPreco = p.getValue().getPreco();
                produtoMaisCaro = p.getValue();
            }
        }
        System.out.println("Nome: "+produtoMaisCaro.getNome()+"  Preço: R$ "+produtoMaisCaro.getPreco());
    }
    
    // Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
    public void obterProdutoMaisBarato(){
        System.out.println("\n-- -- -- -- -- --    PRODUTO MAIS BARATO    -- -- -- --");
        double menorPreco = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        for (Map.Entry<Long, Produto> p : estoqueDeProdutosMAP.entrySet()) {
            if(p.getValue().getPreco() < menorPreco){
                menorPreco = p.getValue().getPreco();
                produtoMaisBarato = p.getValue();
            }
        }
        System.out.println("Nome: "+produtoMaisBarato.getNome()+"  Preço: R$ "+produtoMaisBarato.getPreco());
    }
    
    // Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        System.out.println("\n-- -- -- -- -- --    PRODUTO EM MAIOR VALOR EM RELAÇÃO AO PREÇO X QUANTIDADE    -- -- -- --");
        double valorTotal = 0.0;
        double novoValorTotal = 0.0;
        int quantidade = 0;
        int novaQuantidade = 0;
        Produto produto = null;

        for (Map.Entry<Long, Produto> p : estoqueDeProdutosMAP.entrySet()) {
            quantidade = p.getValue().getQuantidade();
            valorTotal = p.getValue().getPreco() * quantidade;
            if(valorTotal > novoValorTotal){
                novaQuantidade = p.getValue().getQuantidade();
                novoValorTotal = p.getValue().getPreco() * quantidade;
                produto = p.getValue();
            }
        }
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Quantidade: "+novaQuantidade+" x Valor Total: R$ "+novoValorTotal);
        System.out.println();
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(0001, "Álcool Isopropilico", 10, 20.90);
        estoque.adicionarProduto(0002, "Parafuso Auto Brocante Flangeado 4 2X13-10 Peças", 100, 0.49);
        estoque.adicionarProduto(0003, "Fita de Led 21w 5m Luz Branca", 15, 24.42);
        estoque.adicionarProduto(0004, "Fita Veda Rosca 25m", 70, 5.63);
        estoque.exibirProdutos();
        estoque.calcularValorTotalEstoque();
        estoque.obterProdutoMaisCaro();
        estoque.obterProdutoMaisBarato();
        estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }

}
