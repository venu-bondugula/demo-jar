package dc.demo.demojar.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Offer {
    @Id
    @GeneratedValue
    private long id;

/*
    @EmbeddedId
    private CompositePrimaryKey compositePrimaryKey;
*/

    private String description;

}
