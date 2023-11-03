package EasyCar.repo;

import EasyCar.entity.rentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rentDetailsRepo extends JpaRepository<rentDetails,String> {
}
