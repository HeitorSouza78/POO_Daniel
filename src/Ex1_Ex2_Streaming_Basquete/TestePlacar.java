package Ex1_Ex2_Streaming_Basquete;

public class TestePlacar {
    public static void main(String[] args) {

        System.out.println("=== TESTE PLACAR ===");

        Placar jogo = new Placar("Franca", "Ribeirão");

        // Estado inicial
        System.out.println("\n--- Início do jogo ---");
        System.out.println(jogo);

        // Pontuação
        System.out.println("\n--- Pontos ---");
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 1);
        jogo.registrarPonto("visitante", 2);

        System.out.println(jogo);

        // Teste erro
        jogo.registrarPonto("casa", 5); // inválido
        jogo.registrarPonto("timeX", 2); // inválido

        // Avançando períodos
        System.out.println("\n--- Avançando períodos ---");
        jogo.proximoQuarto();
        System.out.println(jogo);

        jogo.proximoQuarto();
        System.out.println(jogo);

        jogo.proximoQuarto();
        System.out.println(jogo);

        // Tentativa após fim
        jogo.proximoQuarto();

        System.out.println("\n--- Final do jogo ---");
        System.out.println(jogo);
    }
}
