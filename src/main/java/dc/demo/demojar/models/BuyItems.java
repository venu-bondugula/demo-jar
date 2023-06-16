 package dc.demo.demojar.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
//@IdClass(BuyId.class)
public class BuyItems {

    @MapsId("foreignIdA")
    @ManyToOne
    Offer offer;

    @MapsId("foreignIdB")
    @ManyToMany
    List<Item> items;

    @EmbeddedId
    private CompositePrimaryKey compositePrimaryKey;

    private int quantity;
}
