package IService;

import Entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {
    List<Pedido> All();
    Optional<Pedido> FindById(Long id);
    Pedido Save(Pedido pedido);
    void Update(Pedido pedido, Long id);
    void Delete(Long id);
}
