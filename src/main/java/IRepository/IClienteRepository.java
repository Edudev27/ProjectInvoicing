package IRepository;


import Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository <Cliente, Long> {
}
