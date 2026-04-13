package FolhaPagamento_Heranca;

public class Junior extends Desenvolvedor{
    public Junior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}
