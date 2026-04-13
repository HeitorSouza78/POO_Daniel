package ClasseInterface;

public class FechaduraEletronica implements  Autenticavel, DispositivoLigavel {
    private String senhaCorreta;
    private boolean destrancada;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.destrancada = false;
    }

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
            ligar(); // destranca
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        destrancada = true;
        System.out.println("Fechadura destrancada.");
    }

    @Override
    public void desligar() {
        destrancada = false;
        System.out.println("Fechadura trancada.");
    }
}
