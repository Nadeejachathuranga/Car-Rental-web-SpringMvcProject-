package EasyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class paymentDto {
    private String payId;
    private String rentId;
    private String amount;
    private String date;

}
