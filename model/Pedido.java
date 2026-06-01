package model;
import jakarta.persistence.*;
@Entity
public class Pedido {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 @ManyToOne
 private Cliente cliente;
}