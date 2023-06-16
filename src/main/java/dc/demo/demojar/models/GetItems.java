package dc.demo.demojar.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class GetItems {

    @Id
    @GeneratedValue
    private long id;

    //@ManyToOne
    //Offer offer;

    //@ManyToMany
    //List<Item> items;

    private int amount;

    private int onShipping;

    private int isPercentage;
}
