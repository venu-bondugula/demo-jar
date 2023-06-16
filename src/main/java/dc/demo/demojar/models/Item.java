package dc.demo.demojar.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
/*
@ToString
@EqualsAndHashCode
@NoArgsConstructor
*/
public class Item {

    @Id
    @GeneratedValue
    private long id;

/*
    @EmbeddedId
    private CompositePrimaryKey compositePrimaryKey;
*/

    private String name;

    private double price;

    private int weightInGrams;

    @ManyToOne
    //@JoinColumn(name = "id", foreignKey = @ForeignKey (name = "FK_COUNTRY"))
    private Country country;

}
