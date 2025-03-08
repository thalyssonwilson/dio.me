package collections.list.ordenacao.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // atributo List da classe Numero;
    List<Numero> listaDeNumeros;

    // construtor instanciando um ArrayList
    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    // metodos
    // adiciona um número à lista
    public void adicionarNumero(int numero){
        listaDeNumeros.add(new Numero(numero));
    }

    // ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections
    public void ordenarAscendente(){
        List<Numero> numerosOrdenadosAscendente = new ArrayList<>(listaDeNumeros);
        Collections.sort(numerosOrdenadosAscendente);
        for (Numero n : numerosOrdenadosAscendente) {
            System.out.printf(n.getNumero()+" ");
        }
    }

    // ordena os números da lista em ordem descendente usando um Comparable e a class Collections
    public void ordenarDescendente(){
        List<Numero> numerosOrdenadosDescendente = new ArrayList<>(listaDeNumeros);
        
        // ordena a lista pelo metodo sort() da interface LIST
        // depois reverte a ordem pelo metodo reverseOrder() da classe Colletions
        numerosOrdenadosDescendente.sort(Collections.reverseOrder());

        for (Numero n : numerosOrdenadosDescendente) {
            System.out.printf(n.getNumero()+" ");
        }
    }


    // NÃO SOLICITADO: exibe todos os números adicionados na lista
    public void exibeNumerosDaLista(){
        for (Numero n : listaDeNumeros) {
            System.out.printf(n.getNumero()+" ");
        }
    }


    public static void main(String[] args) {
        
        OrdenacaoNumeros numerosLISTA = new OrdenacaoNumeros();

        System.out.println("Números adicionados na lista: ");
        numerosLISTA.adicionarNumero(5);
        numerosLISTA.adicionarNumero(19);
        numerosLISTA.adicionarNumero(11);
        numerosLISTA.adicionarNumero(9);
        numerosLISTA.adicionarNumero(21);
        numerosLISTA.exibeNumerosDaLista();
        

        System.out.println("\nOrdenar os numeros de forma Ascendente: ");
        numerosLISTA.ordenarAscendente();

        System.out.println("\nOrdenar os numeros de forma Descendente: ");
        numerosLISTA.ordenarDescendente();

    }

}
