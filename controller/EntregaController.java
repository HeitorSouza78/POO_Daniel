package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EntregaService;
import model.Entrega;

@RestController
@RequestMapping("/entregas")
public class EntregaController {
 @Autowired
 private EntregaService service;

 @GetMapping
 public List<Entrega> listar(){ return service.listarTodos(); }

 @PostMapping
 public Entrega salvar(@RequestBody Entrega obj){ return service.salvar(obj); }

 @DeleteMapping("/{id}")
 public void excluir(@PathVariable Long id){ service.excluir(id); }
}