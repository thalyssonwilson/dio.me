package collections.list.operacoesBasicas.exercicio2;

public class Item {
    // atributos
    private String nome;
    private double preco;
    private int quantidade;


    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "> Nome: " + nome + " Preco: R$ " + preco + " Quantidade:" + quantidade;
    }



    // get
    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }

   
    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

        carrinhoCompras.adicionarItem("Resma A4", 35.00, 1);
        carrinhoCompras.adicionarItem("Pasta de plástico", 2.99, 10);
        carrinhoCompras.adicionarItem("Pilha AAA", 11.00, 12);
        carrinhoCompras.adicionarItem("Caneta azul", 0.99, 50);
        carrinhoCompras.adicionarItem("Caneta azul", 0.99, 50);
        carrinhoCompras.exibirItens();
        System.out.println("---------------------------------");
        carrinhoCompras.calcularValorTotal();

        System.out.println("\n\n----------- Remoção de itens -----------");
        carrinhoCompras.removerItem("Caneta azul");    
        carrinhoCompras.exibirItens();
        carrinhoCompras.calcularValorTotal();

        System.out.println("\n\n----------- Preço total dos itens (preço x quantidade) -----------");
        carrinhoCompras.calcularValorTotal();
        System.out.println();
    }
    

    

}
