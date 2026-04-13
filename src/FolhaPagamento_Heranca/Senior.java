package FolhaPagamento_Heranca;

public class Senior extends Desenvolvedor {
    public Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
