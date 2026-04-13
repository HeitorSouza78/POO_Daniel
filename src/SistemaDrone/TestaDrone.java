package SistemaDrone;

public class TestaDrone {
    public static void main(String[] args){
        Drone d1 = new Drone();

        // configurando o drone
        d1.setCodigo("DR001");
        d1.setBateria(50);
        d1.setAltura(0);

        System.out.println("Estado inicial do drone:");
        System.out.println(d1);

        System.out.println("\nTentando decolar...");
        d1.decolar();

        System.out.println("\nSubindo 10 metros...");
        d1.subir(10);

        System.out.println("\nDescendo 5 metros...");
        d1.descer(5);

        System.out.println("\nTestando altura inválida...");
        d1.setAltura(150);

        System.out.println("\nEstado final do drone:");
        System.out.println(d1);


    }
}
