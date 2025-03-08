package collections.list.pesquisa.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo lista de objetos do tipo "Livro"
    List<Livro> catalogoDeLivros;

    // construtor modificado sem parametros que cria um ArrayList
    public CatalogoLivros() {
        this.catalogoDeLivros = new ArrayList<>();
    }


    // metodos
    // adciona um livro na lista catalogoDeLivros
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogoDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    // filtra(pesquisa) os livros pelo mesmo autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> filtrarLivrosPorAutor = new ArrayList<>();
        if (!catalogoDeLivros.isEmpty()) {
            for (Livro livro : catalogoDeLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    filtrarLivrosPorAutor.add(livro);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }

        // formata os resultados do filtro de forma personalizada
        formataListaDeLivros(filtrarLivrosPorAutor);
        return filtrarLivrosPorAutor;
        
    }

    // filtra(pesquisa) os livros entre determinados anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> filtrarLivrosPorIntervaloAnos = new ArrayList<>();
        if(!catalogoDeLivros.isEmpty()){
            for (Livro livro : catalogoDeLivros) {
                if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                    filtrarLivrosPorIntervaloAnos.add(livro);
                }
            }
        }else{
            System.out.println("A lista está vazia!");
        }

        // formata os resultados do filtro de forma personalizada
        formataListaDeLivros(filtrarLivrosPorIntervaloAnos);
        return filtrarLivrosPorIntervaloAnos;
    }

    // filtra(pesquisa) os livros pelo mesmo titulo e retorna o primeiro livro encontrado.
    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> filtroLivrosPorTitulo = new ArrayList<>();
        if(!catalogoDeLivros.isEmpty()){
            for (Livro livro : catalogoDeLivros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    filtroLivrosPorTitulo.add(livro);
                    break;
                }
            }
        }else{
            System.out.println("A lista está vazia!");
        }

        // formata os resultados do filtro de forma personalizada
        formataListaDeLivros(filtroLivrosPorTitulo);
        return filtroLivrosPorTitulo;
    }

    // NÃO SOLICITADO: exibe o catalogo no terminal para facilitar exibição
    public void exibeCatalogo() {
        for (Livro l : catalogoDeLivros) {
            System.out.println("Titulo: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Ano: " + l.getAno());
        }
    }

    //NÃO SOLICITADO: cria um gabarito de exibição de um lista de livros passando uma lista como parametro
    public void formataListaDeLivros(List<Livro> lista){
        for (Livro l : lista) {
            System.out.println("> Titulo: "+l.getTitulo()+", Autor: "+l.getAutor()+", Ano: "+l.getAno());
        }
    }


}
