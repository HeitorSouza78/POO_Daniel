package FolhaPagamento_Heranca;

public class Pleno extends Desenvolvedor{
    public Pleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }

}
