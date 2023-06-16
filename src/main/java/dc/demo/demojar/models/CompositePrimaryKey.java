package dc.demo.demojar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class CompositePrimaryKey implements Serializable {
    @Column(name = "foreign_id_a")
    private Offer foreignIdA;

    @Column(name = "foreign_id_b")
    private Item foreignIdB;
}
