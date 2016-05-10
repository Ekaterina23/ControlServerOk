package control.server.repository;

import control.server.entity.Control;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ControlRepository extends JpaRepository<Control, Long>{
}
