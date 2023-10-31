package EasyCar.repo;

import EasyCar.entity.rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rentRepo extends JpaRepository<rent,String> {
}
