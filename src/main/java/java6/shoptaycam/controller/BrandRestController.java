package java6.shoptaycam.controller;

import java6.shoptaycam.entity.BrandsEntity;
import java6.shoptaycam.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/brand")
public class BrandRestController {
    @Autowired
    private BrandService service;

    @GetMapping("")
    public ResponseEntity<List<BrandsEntity>> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BrandsEntity> getById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<BrandsEntity> post(@RequestBody BrandsEntity brand) {
        return service.save(brand);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> put(@PathVariable("id") Integer id, @RequestBody BrandsEntity brand) {
        if (id != brand.getId()) {
            return ResponseEntity.ok("The id in the path does not exist");
        }
        return service.put(brand);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.deleteById(id);
    }
}
