package collections.set.pesquisa.exercicio01;

public class Contato {
    // atributos
    private String nome;
    private int telefone;

    // construtor
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // GET
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }

    // SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + telefone;
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
        Contato other = (Contato) obj;
        if (telefone != other.telefone)
            return false;
        return true;
    }

    
    
}

