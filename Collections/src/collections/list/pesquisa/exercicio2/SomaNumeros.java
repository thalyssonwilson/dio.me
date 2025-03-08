package collections.list.pesquisa.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // atributo é uma lista de numeros
    private List<Numero> listaDeNumeros;


    // construtor cria um ArrayList
    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    // metodos
    // adiciona numeros em uma lista
    public void adicionarNumero(int numero){
        listaDeNumeros.add(new Numero(numero));
    }

    // Calcula a soma de todos os números na lista e retorna o resultado.
    public void calcularSoma(){
        if(!listaDeNumeros.isEmpty()){
            int soma = 0;
            for (Numero n : listaDeNumeros) {
                soma += n.getNumero();
            }
            System.out.println("A soma de todos os números na lista é de: "+soma);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
    
    // Encontra o maior número na lista e retorna o valor
    public void encontrarMaiorNumero(){
        
    }

}
