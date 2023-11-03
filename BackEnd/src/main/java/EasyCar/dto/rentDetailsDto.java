package EasyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class rentDetailsDto {
    private String rentId;
    private String returnDay;
    private String extraDays;
    private String totalDays;
    private String totalKm;
    private String freeKm;
    private String paymentId;

    public rentDetailsDto(String rId) {
        this.rentId=rId;
    }
}
