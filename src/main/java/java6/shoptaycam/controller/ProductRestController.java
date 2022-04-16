package java6.shoptaycam.controller;

import java6.shoptaycam.dto.ProductModel;
import java6.shoptaycam.dto.Response.Response;
import java6.shoptaycam.entity.ProductEntity;
import java6.shoptaycam.repository.ProductRepository;
import java6.shoptaycam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class ProductRestController {
    @Autowired
    private ProductService service;

    @GetMapping("")
    public ResponseEntity<List<ProductEntity>> getAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getById(@PathVariable("id") Integer id){
        return service.findById(id);
    }
    @PostMapping("")
    public Response post(@RequestBody ProductModel product){
        return service.save(product);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable("id") Integer id, @RequestBody ProductEntity product){
        if (id != product.getId()){
            ResponseEntity.ok("The id in the path does not exist");
        }
        return service.put(product);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Integer id){
        service.deleteById(id);
    }
}
