package IRepository;

import Entity.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMesaRepository extends JpaRepository <Mesa, Long> {
}
