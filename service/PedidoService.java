package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PedidoRepository;
import model.Pedido;

@Service
public class PedidoService {
 @Autowired
 private PedidoRepository repository;

 public List<Pedido> listarTodos(){ return repository.findAll(); }
 public Pedido salvar(Pedido obj){ return repository.save(obj); }
 public void excluir(Long id){ repository.deleteById(id); }
}