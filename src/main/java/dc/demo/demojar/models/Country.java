package dc.demo.demojar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private double shippingRate;

    private int weightInGrams;
}
