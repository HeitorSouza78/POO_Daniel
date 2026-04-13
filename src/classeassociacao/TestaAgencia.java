package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static  void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "Fulano");
        System.out.println(pas1.toString());
        LocalDateTime data = LocalDateTime.of(2026, 07, 14, 10, 00);
        Voo vo1 = new Voo(999, "Guarulhos", "Salvador", data);
        System.out.println(vo1.toString());

        Reserva re1 = new Reserva(12, LocalDateTime.now(), 36, pas1, vo1);

        System.out.println(re1.toString());
    }
}
