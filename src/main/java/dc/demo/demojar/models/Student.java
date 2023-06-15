package dc.demo.demojar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private double fee;

}
