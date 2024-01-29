package EasyCar.repo;

import EasyCar.entity.car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface carRepo extends JpaRepository<car,String> {
    @Query(value = "SELECT id  FROM car ORDER BY id DESC LIMIT 1;",nativeQuery = true)
    String getLastCarId();

}
