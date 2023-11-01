package EasyCar.repo;

import EasyCar.dto.rentDto;
import EasyCar.entity.rent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface rentRepo extends JpaRepository<rent,String> {

}
