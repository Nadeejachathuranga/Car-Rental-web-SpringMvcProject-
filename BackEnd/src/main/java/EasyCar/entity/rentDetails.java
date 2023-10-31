package EasyCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class rentDetails {
    @Id
    private String rentId;
    private String returnDay;
    private String extraDays;
    private String totalDays;
    private String totalKm;
    private String freeKm;
    private String paymentId;
}
