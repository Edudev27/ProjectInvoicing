package IService;

import Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    List<Cliente> All();
    Optional<Cliente> FindById(Long id);
    Cliente Save(Cliente cliente);
    void Update(Cliente cliente, Long id);
    void Delete(Long id);


}
