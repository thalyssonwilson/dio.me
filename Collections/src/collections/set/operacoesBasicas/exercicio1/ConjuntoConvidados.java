package collections.set.operacoesBasicas.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> setDeConvidados;


    // construtor cria um conjunto do tipo SET
    public ConjuntoConvidados() {
        this.setDeConvidados = new HashSet<>();
    }


    // metodos
    // adiciona um convidado ao conjunto
    public void adicionarConvidado(String nome, int codigoConvite){
        setDeConvidados.add(new Convidado(nome, codigoConvite));
    }

    // Remove um convidado do conjunto com base no código do convite.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaREMOVER = null;
        for (Convidado convidado : setDeConvidados) {
            if(convidado.getCodConvite() == codigoConvite){
                convidadoParaREMOVER = convidado;
                break;
            }
        }
        setDeConvidados.remove(convidadoParaREMOVER);

    }

    // conta o número total de convidados no Set
    public void contarConvidados(){
        System.out.println(setDeConvidados.size());

    }

    // exibe todos os convidados do conjunto
    public void exibirConvidados(){
        for (Convidado convidado : setDeConvidados) {
            System.out.println("Cód.: "+convidado.getCodConvite()+" Nome: "+convidado.getNome());
        }
    }




    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();
        
        System.out.println("* * *   Lista de Convidados   * * *");
        convidados.adicionarConvidado("Pessoa A", 1);
        convidados.adicionarConvidado("Pessoa B", 2);
        convidados.adicionarConvidado("Pessoa C", 3);
        convidados.adicionarConvidado("Pessoa D", 4);
        convidados.adicionarConvidado("Pessoa E", 5);
        convidados.exibirConvidados();

        System.out.printf("\n** Quantidade de Convidados: ");
        convidados.contarConvidados();

        System.out.println("** Remoção do Convidado com o Código 3 ");
        convidados.removerConvidadoPorCodigoConvite(3);

        System.out.println("\nLista de convidados Atualizada: ");
        convidados.exibirConvidados();
        System.out.printf("\n** Quantidade de Convidados: ");
        convidados.contarConvidados();


        

    }


}
