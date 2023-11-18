package EasyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverDto {
    private String id;
    private String licenseId;
    private String name;
    private String contact;
    private String address;

    public DriverDto(String id) {
        this.id=id;
    }
}
