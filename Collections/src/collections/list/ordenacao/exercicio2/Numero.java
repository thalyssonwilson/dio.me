package collections.list.ordenacao.exercicio2;

public class Numero implements Comparable<Numero>{
    // atributo
    private int numero;

    // construtor
    public Numero(int numero) {
        this.numero = numero;
    }

    //get
    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }

    
    

}
