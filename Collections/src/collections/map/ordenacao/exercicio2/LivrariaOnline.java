package collections.map.ordenacao.exercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class LivrariaOnline {
    // atributos
    private Map<String, Livro> livrariaMap;

    // construtor
    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    // adiciona um livro à livraria, utilizando o ISBN como chave no Map                        OK
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    // remove um livro da livraria, dado o titulo do livro                                      OK
    public void removerLivro(String titulo){
        System.out.println("\n*  *  *     REMOVER LIVRO PELO TITULO");
        for (Map.Entry<String,Livro> entry : livrariaMap.entrySet()) {
            if(entry.getValue().getTítulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro: "+titulo+", foi removido!");
                livrariaMap.remove(entry.getKey());
                break;
            }
        }
    } 

    // exibe os livros da livraria em ordem crescente de preço                                  OK
    public void exibirLivrosOrdenadosPorPreco(){
        System.out.println("\n*  *  *   LIVROS EXIBIDOS POR ORDEM CRESCENTE DE PREÇO  ");

        Map<String, Livro> livrariaTreeMap = new TreeMap<>(livrariaMap);
        List<Map.Entry<String, Livro>> listaTreeMapPorPreco = new ArrayList<>(livrariaTreeMap.entrySet());
        listaTreeMapPorPreco.sort(new ComparatorPorPreco());
                
        for (Map.Entry<String, Livro> entry : listaTreeMapPorPreco) {
            System.out.println("Preço: R$ "+entry.getValue().getPreco()+"  Livro: "+entry.getValue().getTítulo());
        }
    }

    // retorna uma lista de todos os livros escritos por um determinado autor                   OK
    public void pesquisarLivrosPorAutor(String autor){

        System.out.println("\n*  *  *     Livros do Autor "+autor);
        Map<String, Livro> livrariaTreeMap = new TreeMap<>(livrariaMap);
        List<Map.Entry<String, Livro>> listaTreeMapPorAutor = new ArrayList<>(livrariaTreeMap.entrySet());

        for (Map.Entry<String,Livro> entry : listaTreeMapPorAutor) {
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                System.out.println("Titulo: "+entry.getValue().getTítulo());
            }
        }

    }

    // retorna o livro mais caro disponível na livraria                                         OK
    public void obterLivroMaisCaro(){
        System.out.println("\n*  *  *     LIVRO MAIS CARO");
        Map<String, Livro> livrosTreeMap = new TreeMap<>(livrariaMap);
        List<Map.Entry<String, Livro>> listaTreeMapMaisCaro = new ArrayList<>(livrosTreeMap.entrySet());
        listaTreeMapMaisCaro.sort(new ComparatorPorPreco().reversed());

        for (Map.Entry<String,Livro> entry : listaTreeMapMaisCaro) {
            System.out.println("Autor: "+entry.getValue().getAutor()+"   Preço: R$ "+entry.getValue().getPreco());
            System.out.println("Titulo: "+entry.getValue().getTítulo());
            break;
        }
    }
    
    // retorna o livro mais barato disponível na livraria                                       OK
    public void exibirLivroMaisBarato(){
        System.out.println("\n*  *  *     LIVRO MAIS BARATO");
        Map<String, Livro> livrariaTreeMap = new TreeMap<>(livrariaMap);
        List<Map.Entry<String, Livro>> listaTreeMapMaisBarato = new ArrayList<>(livrariaTreeMap.entrySet());
        listaTreeMapMaisBarato.sort(new ComparatorPorPreco());
        for (Map.Entry<String,Livro> entry : listaTreeMapMaisBarato) {
            System.out.println("Autor: "+entry.getValue().getAutor()+"    Preço: R$ "+entry.getValue().getPreco());
            System.out.println("Titulo: "+entry.getValue().getTítulo());
            break;
        }
    }



    public static void main(String[] args) {
        LivrariaOnline livrariaOn = new LivrariaOnline();

        livrariaOn.adicionarLivro("link 1", "Os segredos da mente milionária", "T. Harv Eker", 27.28);
        livrariaOn.adicionarLivro("link 2", "A coragem de não agradar", "Ichiro Kishimi", 30.62);
        livrariaOn.adicionarLivro("link 3", "A psicologia financeira", "Morgan Housel", 30.44);
        livrariaOn.adicionarLivro("link 4", "Como falar em público e encantar as pessoas", "Dale Carnegie", 40.71);
        livrariaOn.adicionarLivro("link 5", "O homem mais rico da Babilônia", "George S Clason", 22.42);
        livrariaOn.adicionarLivro("link 6", "A psicologia do dinheiro", "Morgan Housel", 38.41);
        livrariaOn.exibirLivrosOrdenadosPorPreco();
        livrariaOn.pesquisarLivrosPorAutor("Morgan Housel");
        livrariaOn.obterLivroMaisCaro();
        livrariaOn.exibirLivroMaisBarato();
        livrariaOn.removerLivro("A psicologia financeira");
        livrariaOn.exibirLivrosOrdenadosPorPreco();
    }

}
