package collections.map.operacoesBasicas.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> dicionarioMAP;

    // construtor map
    public Dicionario() {
        this.dicionarioMAP = new HashMap<>();
    }

    // adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMAP.put(palavra, definicao);
        System.out.println("A palavra "+palavra+" foi adicionada ao dicionário!");
    }
    // remove uma palavra do dicionário, dado o termo a ser removido.
    public void removerPalavra(String palavra){
        System.out.println("\n*  *  *     REMOÇÃO DA PALAVRA "+palavra.toUpperCase()+"     *  *  *");
        if(!dicionarioMAP.isEmpty()){
            if(dicionarioMAP.containsKey(palavra)){
                dicionarioMAP.remove(palavra);
                System.out.println("A palavra "+palavra+" foi removida.");
            }
        }else{
            System.out.println("O dicionário está vazia.");
        }
    }
    // exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    public void exibirPalavras(){
        System.out.println("\n*  *  *     DICIONÁRIO DE PALAVRAS     *  *  *");
        if(!dicionarioMAP.isEmpty()){
            dicionarioMAP.forEach((palavra, definicao) -> {
                System.out.println("Palavra: "+palavra+"   Definição: "+definicao);
            });
        }else{
            System.out.println("Dicionário vazio.");
        }
    }
    // pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    public void pesquisarPorPalavra(String palavra){
        System.out.println("\n*  *  *     PESQUISA PELA PALAVRA "+palavra.toUpperCase()+"    *  *  *");
        if (!dicionarioMAP.isEmpty()) {
            if(dicionarioMAP.containsKey(palavra)){
                System.out.println("Definiçao: "+dicionarioMAP.get(palavra));
            }else{
                System.out.println("Palavra não está no dicionário!");
            }            
        }else{
            System.out.println("Dicionário vazio.");
        }
    }

    
    public static void main(String[] args) {
        
        Dicionario dicionarioDePalavras = new Dicionario();

        System.out.println("\n*  *  *     ADICIONANDO PALAVRAS     *  *  *");
        dicionarioDePalavras.adicionarPalavra("cachorro", "animal doméstico, mamifero");
        dicionarioDePalavras.adicionarPalavra("gato", "animal doméstico, mamifero");
        dicionarioDePalavras.adicionarPalavra("leão", "animal silvestre, carnivoro");
        dicionarioDePalavras.adicionarPalavra("lagarto", "animal silvestre, réptil");
        dicionarioDePalavras.exibirPalavras();
        dicionarioDePalavras.removerPalavra("lagarto");
        dicionarioDePalavras.pesquisarPorPalavra("gato");
        dicionarioDePalavras.exibirPalavras();
        
    }

    



}
