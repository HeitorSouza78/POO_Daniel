package Sistema_Veiculos_Heranca;

public class Teste {
    public static void main(String[] args) {

        Veiculo v;

        // Apontando para avião
        v = new Aviao("Boeing", "737", 850, 12000);
        v.mover();

        // Agora aponta para carro elétrico
        v = new CarroEletrico("Tesla", "Model 3", 120, 400);
        v.mover();
    }
}
