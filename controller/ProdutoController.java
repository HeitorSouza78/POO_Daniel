package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProdutoService;
import model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
 @Autowired
 private ProdutoService service;

 @GetMapping
 public List<Produto> listar(){ return service.listarTodos(); }

 @PostMapping
 public Produto salvar(@RequestBody Produto obj){ return service.salvar(obj); }

 @DeleteMapping("/{id}")
 public void excluir(@PathVariable Long id){ service.excluir(id); }
}