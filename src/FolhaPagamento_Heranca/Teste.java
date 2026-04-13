package FolhaPagamento_Heranca;

public class Teste {
    public static void main(String[] args) {

        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana", 3000);
        devs[1] = new Pleno("Carlos", 5000);
        devs[2] = new Senior("Mariana", 8000);
        devs[3] = new Desenvolvedor("João", 4000);

        for (Desenvolvedor d : devs) {
            d.codar();
            System.out.println("Bônus: " + d.calcularBonus());
            System.out.println(d);
            System.out.println("-------------------");
        }
    }
}
