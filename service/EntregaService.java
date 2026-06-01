package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EntregaRepository;
import model.Entrega;

@Service
public class EntregaService {
 @Autowired
 private EntregaRepository repository;

 public List<Entrega> listarTodos(){ return repository.findAll(); }
 public Entrega salvar(Entrega obj){ return repository.save(obj); }
 public void excluir(Long id){ repository.deleteById(id); }
}