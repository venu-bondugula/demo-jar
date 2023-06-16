package dc.demo.demojar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.demo.demojar.models.Item;
import dc.demo.demojar.services.ItemService;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") long id) {
        return ResponseEntity.of(service.getItemById(id));
    }

    @GetMapping()
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @PostMapping
    public void createItem(@RequestBody Item item) {
        service.createItem(item);
    }

}
