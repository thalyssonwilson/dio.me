package collections.map.operacoesBasicas.exercicio2;

public class Palavra {
    
    // atributo
    private String palavra;
    private String definicao;

    
    // construtor
    public Palavra(String palavra, String definicao) {
        this.palavra = palavra;
        this.definicao = definicao;
    }


    // GET
    public String getPalavra() {
        return palavra;
    }
    public String getDefinicao() {
        return definicao;
    }

    

}
