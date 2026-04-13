package SistemaGestaoDisciplinas;

public class TesteAcademico {
    public static void main(String[] args) {

        //  alunos independentes
        Aluno a1 = new Aluno(1, "Heitor", "123", "ADS");
        Aluno a2 = new Aluno(2, "Ana", "456", "SI");

        //  disciplina
        Disciplina d = new Disciplina(1, "POO", "Daniel");

        //  agregação
        d.matricularAluno(a1);
        d.matricularAluno(a2);

        //  composição
        d.criarAvaliacao(1, "Prova Semestral");

        //  composição aninhada
        Avaliacao av = d.getUltimaAvaliacao();

        av.adicionarQuestao(1, "O que é POO?", 2.0f);
        av.adicionarQuestao(2, "Explique encapsulamento", 3.0f);
        av.adicionarQuestao(3, "Diferença entre herança e composição", 5.0f);

        //  resultado final
        System.out.println(d);
    }
}
