package collections.set.ordenacao.exercicio2;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> gerenciadorDeAlunos;

    public GerenciadorAlunos() {
        this.gerenciadorDeAlunos = new HashSet<>();
    }


    //M E T O D O S
    // adiciona um aluno ao conjunto
    public void adicionarAluno(String nome, Long matricula, double media){
        gerenciadorDeAlunos.add(new Aluno(nome, matricula, media));
    }

    // remove um aluno ao conjunto a partir da matricula, se estiver presente
    public void removerAluno(long matricula){
        boolean condicao = false;
        System.out.println("\n*  *  *    REMOVE O ALUNO PELA MATRICULA   *  *  *");
        if(!gerenciadorDeAlunos.isEmpty()){
            for (Aluno a : gerenciadorDeAlunos) {
                if(a.getMatrícula() == matricula){
                    gerenciadorDeAlunos.remove(a);
                    System.out.println("Aluno removido pela matricula: "+matricula);    
                    condicao = true;
                }
            }
            if(condicao == false){
                System.out.println("Matricula não encontrada!");
            }
        }else{
            System.out.println("ERRO, nenhum aluno foi adicionado ainda!");
        }
        
    }

    // Exibe todos os alunos do conjunto em ordem alfabética pelo nome
    public void exibirAlunosPorNome(){
        Set<Aluno> alunosTreeSet = new TreeSet<>(gerenciadorDeAlunos);
        System.out.println("\n*  *  *    EXIBIR ALUNOS POR NOME   *  *  *");
        for (Aluno aluno : alunosTreeSet) {
            System.out.println("Nome: "+aluno.getNome());
        }
    }

    // exibe todos os alunos do conjunto em ordem crescente de nota
    public void exibirAlunosPorNota(){
        Set<Aluno> alunosTreeSetNotas = new TreeSet<>(new ComparatorPorNota());
        alunosTreeSetNotas.addAll(gerenciadorDeAlunos);
        System.out.println("\n*  *  *    EXIBIR ALUNOS POR NOTA CRESCENTE  *  *  *");
        for (Aluno aluno : alunosTreeSetNotas) {
            System.out.println("Nota: "+aluno.getNota()+" Aluno: "+aluno.getNome());
        }
    }

    // exibe todos os alunos do conjunto
    public void exibirAlunos(){
        System.out.println("\n*  *  *    EXIBIR TODOS OS ALUNOS   *  *  *");
        for (Aluno aluno : gerenciadorDeAlunos) {
            System.out.println("Matricula: "+aluno.getMatrícula()+"  Aluno: "+aluno.getNome()+"  Nota: "+aluno.getNota());
        }
    }


    public static void main(String[] args) {

        GerenciadorAlunos controleDeAlunos = new GerenciadorAlunos();

        System.out.println("Adicionando alunos no conjunto.");
        controleDeAlunos.adicionarAluno("Amélia", 1001L, 10.0);
        controleDeAlunos.adicionarAluno("Dorival", 1002L, 5.0);
        controleDeAlunos.adicionarAluno("Helena", 1003L, 9.5);
        controleDeAlunos.adicionarAluno("Bebeto", 1004L, 5.0);
        controleDeAlunos.adicionarAluno("Roxele", 1005L, 8.9);
        controleDeAlunos.adicionarAluno("Arnaldo", 1006L, 6.0);
        controleDeAlunos.exibirAlunos();
        controleDeAlunos.removerAluno(1006);
        controleDeAlunos.exibirAlunos();
        controleDeAlunos.exibirAlunosPorNome();
        controleDeAlunos.exibirAlunosPorNota();


    }

    
}






 



