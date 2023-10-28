package EasyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class customerDto {
    private String id;
    private String name;
    private String address;
    private String lid;
    private String contact;
    private String email;

    public customerDto(String id) {
        this.id=id;
    }
}
