package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ClienteService;
import model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
 @Autowired
 private ClienteService service;

 @GetMapping
 public List<Cliente> listar(){ return service.listarTodos(); }

 @PostMapping
 public Cliente salvar(@RequestBody Cliente obj){ return service.salvar(obj); }

 @DeleteMapping("/{id}")
 public void excluir(@PathVariable Long id){ service.excluir(id); }
}