package collections.set.operacoesBasicas.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributo do tipo Set
    private Set<Palavra> setPalavras;


    // construtor cria um conjunto Set com HashSet
    public ConjuntoPalavrasUnicas() {
        this.setPalavras = new HashSet<>();
    }
    
    // metodos
    // adiciona uma palavra ao conjunto
    public void adicionarPalavra(String palavra){
        setPalavras.add(new Palavra(palavra));
    }

    // remove uma palavra do conjunto
    public void removerPalavra(String palavra){      
        Palavra palavraParaRemover = null; // variavel que é um objeto da classe Palavra
        for (Palavra p : setPalavras) {
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                System.out.println("A palavra "+palavra+" foi removida");
                setPalavras.remove(palavraParaRemover); // método 'remove()' só exclui exclusivamente Objetos,
                                                        // por isso uma variável para armazenar o objeto foi necessária
            }
        }    
        
    }

    // verifica se uma palavra está presente no conjunto
    public void verificarPalavra(String palavra){
        for (Palavra p : setPalavras) {
            if(palavra.equalsIgnoreCase(p.getPalavra())){
                System.out.println("Palavra "+palavra+" está no conjunto set");
                break;
            }else{
                System.out.println("A palavra "+palavra+" não está no conjunto set");
                break;
            }
        }

    }
    
    // exibe todas as palavras únicas do conjunto
    public void exibirPalavrasUnicas(){
        System.out.println("\n> Todas as Palavras no Conjunto são: ");
        for (Palavra palavra : setPalavras) {
            System.out.println(palavra.getPalavra());
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoSetDePalavras = new ConjuntoPalavrasUnicas();
        System.out.println("> Adicionando Palavras no Conjunto Set: ");
        conjuntoSetDePalavras.adicionarPalavra("Azul");
        conjuntoSetDePalavras.adicionarPalavra("Vermelho");
        conjuntoSetDePalavras.adicionarPalavra("Amarelo");
        conjuntoSetDePalavras.adicionarPalavra("Verde");
        System.out.println("A palavra Azul foi adicionada");
        System.out.println("A palavra Vermelho foi adicionada");
        System.out.println("A palavra Amarelo foi adicionada");
        System.out.println("A palavra Verde foi adicionada");

        conjuntoSetDePalavras.exibirPalavrasUnicas();
        System.out.println("\n> Coferir se uma palavra está no conjunto Set");
        conjuntoSetDePalavras.verificarPalavra("preto");

        System.out.println("\n> Remover uma palavra: ");
        conjuntoSetDePalavras.removerPalavra("Verde");

        conjuntoSetDePalavras.exibirPalavrasUnicas();



    }
 


}
