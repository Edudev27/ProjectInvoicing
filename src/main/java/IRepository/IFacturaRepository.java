package IRepository;

import Entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepository extends JpaRepository <Factura, Long> {
}
