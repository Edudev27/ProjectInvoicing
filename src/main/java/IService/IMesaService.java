package IService;

import Entity.Mesa;

import java.util.List;
import java.util.Optional;

public interface IMesaService {
    List<Mesa> All();
    Optional<Mesa> FindById(Long id);
    Mesa Save(Mesa mesa);
    void Update(Mesa mesa, Long id);
    void Delete(Long id);
}
