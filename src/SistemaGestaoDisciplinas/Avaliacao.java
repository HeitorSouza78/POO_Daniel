package SistemaGestaoDisciplinas;
import java.util.ArrayList;
public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    //  composição: cria a questão dentro da avaliação
    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        questoes.add(q);
    }

    @Override
    public String toString() {
        String out = "Avaliacao{id=" + id + ", nome='" + nome + "'}\n";

        for (Questao q : questoes) {
            out += "   " + q + "\n";
        }

        return out;
    }
}
