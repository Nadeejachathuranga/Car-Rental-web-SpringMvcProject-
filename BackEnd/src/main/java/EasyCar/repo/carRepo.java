package EasyCar.repo;

import EasyCar.entity.car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface carRepo extends JpaRepository<car,String> {
}
