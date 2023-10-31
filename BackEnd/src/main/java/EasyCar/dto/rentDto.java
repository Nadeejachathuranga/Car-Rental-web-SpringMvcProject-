package EasyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class rentDto {
   private String rentId;
   private String cusId;
   private String carId;
   private String days;
   private String pickDay;
   private String status;

    public rentDto(String rentId, String status) {
        this.rentId=rentId;
        this.status=status;
    }
}
