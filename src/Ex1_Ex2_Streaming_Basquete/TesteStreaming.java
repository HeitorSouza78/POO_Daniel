package Ex1_Ex2_Streaming_Basquete;

public class TesteStreaming {
    public static void main(String[] args) {

        System.out.println("=== TESTE STREAMING ===");

        Streaming user1 = new Streaming("Heitor", "Premium");
        Streaming user2 = new Streaming("Ana", "Básico");

        // Estado inicial
        System.out.println("\n--- Usuário 1 ---");
        System.out.println(user1);

        System.out.println("\n--- Usuário 2 ---");
        System.out.println(user2);

        // Assistindo filmes
        System.out.println("\n--- Assistindo ---");
        user1.assistirFilme("Interestelar");
        user2.assistirFilme("Matrix");

        // Cancelando assinatura
        System.out.println("\n--- Cancelando usuário 2 ---");
        user2.cancelarAssinatura();

        // Tentando assistir após cancelamento
        user2.assistirFilme("Vingadores");

        // Estado final
        System.out.println("\n--- Estado Final ---");
        System.out.println(user1);
        System.out.println();
        System.out.println(user2);
    }
}
