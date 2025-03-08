package collections.list.pesquisa.exercicio1;

public class Livro {
    // atributos da classe livro
    private String titulo;
    private String autor;
    private int ano;

    
    // construtor com os parametros para criar um livro
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    

    @Override
    public String toString() {
        return "titulo: " + titulo + ", Autor=" + autor + ", Ano=" + ano + "}";
    }



public static void main(String[] args) {
    // cria uma lista de livros
    CatalogoLivros catalogo = new CatalogoLivros();
    // adicionando livros no catalogo
    catalogo.adicionarLivro("Livro 1", "Fulano 1", 1915);
    catalogo.adicionarLivro("Livro 2", "Fulano 2", 1960);
    catalogo.adicionarLivro("Livro 2", "Fulano 1", 2000);
    catalogo.adicionarLivro("Livro 3", "Fulano 3", 2005);
    catalogo.adicionarLivro("Livro 3", "Fulano 3", 2010);
    catalogo.adicionarLivro("Livro 4", "Fulano 4", 2023);
    catalogo.adicionarLivro("Livro 5", "Fulano 5", 2025);
    System.out.println("*  *  *     Catalogo de Livros     *  *  *");
    //Exibe o Catalogo com todos os Livros
    catalogo.exibeCatalogo();

    //começo do filtro: busca por AUTOR os conteúdos salvos na lista.
    System.out.println("\n* * * * *      PESQUISA POR AUTOR       * * * * *    ");
    System.out.println("Pesquisando pelo autor: Fulano 1");
    System.out.println("\nPesquisando pelo autor: Fulano 2");
    catalogo.pesquisarPorAutor("Fulano 2");
    System.out.println("\nPesquisando pelo autor: Fulano 3");
    catalogo.pesquisarPorAutor("Fulano 3");
    System.out.println("\nPesquisando pelo autor: Fulano 4");
    catalogo.pesquisarPorAutor("Fulano 4");
    System.out.println("\nPesquisando pelo autor: Fulano 5");
    catalogo.pesquisarPorAutor("Fulano 5");

    //começo do filtro: busca pelo INTERVALO DE ANOS os conteúdos salvos na lista.
    System.out.println("\n\n* * * * *      PESQUISA POR INTERVALO DE ANOS       * * * * *    ");
    System.out.println("Pesquisando pelo intervalo de anos: 1900 ~ 2000");
    catalogo.pesquisarPorIntervaloAnos(1900, 2000);
    System.out.println("\nPesquisando pelo intervalo de anos: 2000 ~ 2020");
    catalogo.pesquisarPorIntervaloAnos(2000, 2020);
    System.out.println("\nPesquisando pelo intervalo de anos: 2000 ~ 2050");
    catalogo.pesquisarPorIntervaloAnos(2000, 2050);

    //começo do filtro: busca pelo TITULO e retorna o primeiro livro encontrado.
    System.out.println("\n\n* * * * *      PESQUISA POR TITULO       * * * * *    ");
    System.out.println("Pesquisando pelo primeiro titulo: Livro 1");
    catalogo.pesquisarPorTitulo("Livro 1");
    System.out.println("\nPesquisando pelo primeiro titulo: Livro 2");
    catalogo.pesquisarPorTitulo("Livro 2");
    System.out.println("\nPesquisando pelo primeiro titulo: Livro 3");
    catalogo.pesquisarPorTitulo("Livro 3");
    System.out.println("\nPesquisando pelo primeiro titulo: Livro 4");
    catalogo.pesquisarPorTitulo("Livro 4");
    System.out.println("\nPesquisando pelo primeiro titulo: Livro 5");
    catalogo.pesquisarPorTitulo("Livro 5");
    
    }

}
