package ClasseInterface;

public class TestaSmartHome {
    public static void main(String[] args) {

        System.out.println("=== FECHADURA ===");
        FechaduraEletronica f = new FechaduraEletronica("1234");

        f.validarAcesso("0000"); // errado
        f.validarAcesso("1234"); // correto
        f.desligar(); // trancar

        System.out.println("\n=== TERMOSTATO ===");
        TermoStatoSmart t = new TermoStatoSmart();

        t.ligar();
        System.out.println("Temperatura: " + t.lerTemperatura());

        t.desligar();
        t.lerTemperatura(); // erro
    }
}
