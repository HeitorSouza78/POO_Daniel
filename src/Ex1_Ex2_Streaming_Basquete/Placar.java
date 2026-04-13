package Ex1_Ex2_Streaming_Basquete;

public class Placar {
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String casa, String visitante) {
        this.nomeTimeCasa = casa;
        this.nomeTimeVisitante = visitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {

        if (tipo != 1 && tipo != 2 && tipo != 3) {
            System.out.println("Tipo de ponto inválido!");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        } else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        } else {
            System.out.println("Time inválido!");
        }
    }

    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
        } else {
            System.out.println("O jogo já terminou!");
        }
    }

    @Override
    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] "
                + nomeTimeVisitante + " - Período: " + periodoQuarto;
    }

}
