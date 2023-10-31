package EasyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class car {
    @Id
    private String id;
    private String name;
    private String brand;
    private String type;
    private String regNo;
    private String priceExtraKm;
    private String transmissionType;
    private String rate;
    private String noOfPassengers;
    private String fuel;
    private String color;
}
