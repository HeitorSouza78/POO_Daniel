public class TestaAr {
    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();

        ar.setMarca("LGPD");
        ar.setModelo("Dual Inverter");

        ar.setTemperatura(25);
        ar.setLigado(true);

        System.out.println(ar);

        System.out.println("\nTestando temperatura inválida:");
        ar.setTemperatura(10);

        System.out.println("\nAtivando modo turbo:");
        ar.ativarModoTurbo();

        System.out.println("\nEstado final do ar:");
        System.out.println(ar);
    }
}
