package IRepository;

import Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository extends JpaRepository <Pedido, Long> {
}
