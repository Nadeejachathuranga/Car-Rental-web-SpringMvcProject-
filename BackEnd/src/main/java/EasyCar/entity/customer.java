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
public class customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String lid;
    private String contact;
    private String email;

}
