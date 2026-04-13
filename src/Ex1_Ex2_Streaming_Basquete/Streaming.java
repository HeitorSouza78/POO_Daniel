package Ex1_Ex2_Streaming_Basquete;

public class Streaming {
    private String usuario;
    private String plano;
    private double mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        switch (plano) {
            case "Básico":
                this.mensalidade = 25.90;
                break;
            case "Premium":
                this.mensalidade = 45.90;
                break;
            case "Família":
                this.mensalidade = 60.90;
                break;
            default:
                System.out.println("Plano inválido! Definindo como Básico.");
                this.plano = "Básico";
                this.mensalidade = 25.90;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa! Pague a fatura.");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false;
    }

    @Override
    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme: " + ultimoFilmeAssistido;
    }
}
