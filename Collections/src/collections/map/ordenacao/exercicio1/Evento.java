package collections.map.ordenacao.exercicio1;

import java.util.List;

public class Evento {

    // atributos 
    private String nomeEvento;
    private List<String> nomeAtracao;


    // construtor
     public Evento(String nomeEvento, List<String> nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }


    // GET
    public String getNomeEvento() {
        return nomeEvento;
    }
    public List<String> getNomeAtracao() {
        return nomeAtracao;
    }
    

}


