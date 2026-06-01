package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;
import model.Cliente;

@Service
public class ClienteService {
 @Autowired
 private ClienteRepository repository;

 public List<Cliente> listarTodos(){ return repository.findAll(); }
 public Cliente salvar(Cliente obj){ return repository.save(obj); }
 public void excluir(Long id){ repository.deleteById(id); }
}