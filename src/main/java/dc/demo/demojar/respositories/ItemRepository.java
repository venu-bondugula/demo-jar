package dc.demo.demojar.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dc.demo.demojar.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByName(String name);
}
