package dc.demo.demojar.models;

import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
public class BuyId implements Serializable {
    private Offer offer;

    private List<Item> items;


}
