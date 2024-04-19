package IService;

import Entity.Factura;

import java.util.List;
import java.util.Optional;

public interface IFacturaService {
    List<Factura> All();
    Optional<Factura> FindById(Long id);
    Factura Save(Factura factura);
    void Update(Factura factura, Long id);
    void Delete(Long id);
}
