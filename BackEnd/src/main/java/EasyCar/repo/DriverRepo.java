package EasyCar.repo;

import EasyCar.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DriverRepo extends JpaRepository<Driver,String> {
    @Query(value = "SELECT id  FROM driver ORDER BY id DESC LIMIT 1;",nativeQuery = true)
    String getLastDriverId();
}
