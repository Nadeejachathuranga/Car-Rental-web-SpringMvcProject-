package EasyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class carDto {
    private String id;
    private String name;
    private String brand;
    private String type;
    private String regNo;
    private String priceExtraKm;
    private String freeKmDay;
    private String transmissionType;
    private String rate;
    private String noOfPassengers;
    private String fuel;
    private String color;

    public carDto(String id) {
        this.id=id;
    }


}
