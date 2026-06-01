package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PedidoService;
import model.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
 @Autowired
 private PedidoService service;

 @GetMapping
 public List<Pedido> listar(){ return service.listarTodos(); }

 @PostMapping
 public Pedido salvar(@RequestBody Pedido obj){ return service.salvar(obj); }

 @DeleteMapping("/{id}")
 public void excluir(@PathVariable Long id){ service.excluir(id); }
}