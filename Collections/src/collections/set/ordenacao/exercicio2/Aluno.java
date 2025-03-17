package collections.set.ordenacao.exercicio2;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    // atributos
    private String nome;
    private long matrícula;
    private double nota;

    
    // contrutor
    public Aluno(String nome, long matrícula, double nota) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota = nota;
    }


    // GET
    public String getNome() {
        return nome;
    }
    public long getMatrícula() {
        return matrícula;
    }
    public double getNota() {
        return nota;
    }




     // equals e hascode
     @Override
     public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + (int) (matrícula ^ (matrícula >>> 32));
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
         Aluno other = (Aluno) obj;
         if (matrícula != other.matrícula)
             return false;
         return true;
     }
     

    // implementação do comparable
    @Override
    public int compareTo(Aluno o) {
        return nome.compareTo(o.getNome());
    }


}

// comparator por nota em seguida pelo nome para não excluir aluno por notas iguais
class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {

        // Primeiro, compara pelas notas
        int notaCompare = Double.compare(o1.getNota(), o2.getNota());
        
        // Se as notas forem iguais, compara pelos nomes
        if (notaCompare == 0) {
            return o1.getNome().compareTo(o2.getNome());
        }
        return notaCompare;
    }
    
 }
