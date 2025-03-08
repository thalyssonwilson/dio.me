package collections.list.operacoesBasicas.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList = new ArrayList<>();



    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    







    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    // remoção de itens pelo nome
    public void removerItem(String nome){
        List<Item> itemListRemove = new ArrayList<>();
        for (Item item : itemList) {
            if(item.getNome().equals(nome)){
                itemListRemove.add(item);
            }
        }
        itemList.removeAll(itemListRemove);

    }

    public void calcularValorTotal(){
        double valorTotal = 0.0;
        for (Item item : itemList) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        System.out.println("Valor total dos itens é: R$ "+valorTotal);
        

    }

    // exibe todos os itens cadastrados na lista de itens
    public void exibirItens(){
        System.out.println("Itens no Carrinho. ");
        for (Item item : itemList) {
            System.out.println(item.toString());
        }

    }

}
