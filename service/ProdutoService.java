package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProdutoRepository;
import model.Produto;

@Service
public class ProdutoService {
 @Autowired
 private ProdutoRepository repository;

 public List<Produto> listarTodos(){ return repository.findAll(); }
 public Produto salvar(Produto obj){ return repository.save(obj); }
 public void excluir(Long id){ repository.deleteById(id); }
}