package model;
import jakarta.persistence.*;
@Entity
public class Entrega {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 @OneToOne
 private Pedido pedido;
 private String status;
}