package collections.map.ordenacao.exercicio2;

import java.util.Comparator;
import java.util.Map;

public class Livro implements Comparable<Livro> {
    // atributos
    private String titulo; 
    private String autor;
    private double preco;

    // construtor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // GET
    public String getTítulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Livro o) {
        return titulo.compareTo(o.getTítulo());
    }


}

// comparator
class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String,Livro> entry1, Map.Entry<String, Livro> entry2){
        return Double.compare(entry1.getValue().getPreco(), entry2.getValue().getPreco());
    }
}

