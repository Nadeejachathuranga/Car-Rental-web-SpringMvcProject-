package EasyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class rent {
    @Id
    private String rentId;
    private String cusId;
    private String carId;
    private String days;
    private String pickDay;
    private String status;
}
