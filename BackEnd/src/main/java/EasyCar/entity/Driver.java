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
public class Driver {
    @Id
    private String id;
    private String licenseId;
    private String name;
    private String contact;
    private String address;
}
