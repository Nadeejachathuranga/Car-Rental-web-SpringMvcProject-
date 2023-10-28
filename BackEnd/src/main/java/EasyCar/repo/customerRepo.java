package EasyCar.repo;

import EasyCar.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepo extends JpaRepository<customer,String> {
}
