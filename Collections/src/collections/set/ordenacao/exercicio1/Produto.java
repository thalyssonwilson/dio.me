package collections.set.ordenacao.exercicio1;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{

    // atributos
    private String nome;
    private long cod;
    private Double preco;
    private int quantidade;

    // metodo construtor
    public Produto(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    // GET
    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareTo(o.getNome());
    }

}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

}