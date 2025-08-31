package epass.project.backend.demo.Repository;

import epass.project.backend.demo.model.Epass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpassRepository extends JpaRepository<Epass, Long> {
}
