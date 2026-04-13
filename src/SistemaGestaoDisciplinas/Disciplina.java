package SistemaGestaoDisciplinas;
import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;

    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // 🔗 AGREGAÇÃO
    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    // 🧩 COMPOSIÇÃO
    public void criarAvaliacao(int id, String nome) {
        Avaliacao a = new Avaliacao(id, nome);
        avaliacoes.add(a);
    }

    // 🔥 útil para acessar a última avaliação criada
    public Avaliacao getUltimaAvaliacao() {
        if (avaliacoes.isEmpty()) return null;
        return avaliacoes.get(avaliacoes.size() - 1);
    }

    @Override
    public String toString() {
        String out = "\n=== DISCIPLINA ===\n";
        out += "Nome: " + nome + " | Professor: " + professor + "\n";

        out += "\n--- Alunos ---\n";
        for (Aluno a : alunos) {
            out += a + "\n";
        }

        out += "\n--- Avaliações ---\n";
        for (Avaliacao av : avaliacoes) {
            out += av + "\n";
        }

        return out;
    }
}
