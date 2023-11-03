package EasyCar.repo;

import EasyCar.dto.rentDto;
import EasyCar.entity.rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface rentRepo extends JpaRepository<rent,String> {
    @Query(value = "SELECT rentId  FROM rent ORDER BY rentId DESC LIMIT 1;",nativeQuery = true)
    String getLastRenId();
}
