package ClasseInterface;
import java.util.Random;

public class TermoStatoSmart implements DispositivoLigavel, SensorTemperatura{
    private boolean ligado;

    public TermoStatoSmart() {
        this.ligado = false;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (!ligado) {
            System.out.println("Termostato desligado!");
            return 0;
        }

        // simula temperatura
        return 20 + new Random().nextDouble() * 10;
    }

}
