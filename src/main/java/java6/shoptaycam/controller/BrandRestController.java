package java6.shoptaycam.controller;

import java6.shoptaycam.entity.BrandsEntity;
import java6.shoptaycam.model.BrandModel;
import java6.shoptaycam.model.map.BrandMap;
import java6.shoptaycam.service.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/brand")
public class BrandRestController {

    private final BrandService service;

    public BrandRestController(BrandService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<BrandsEntity>> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public BrandModel getById(@PathVariable("id") Integer id) {
        ResponseEntity<BrandsEntity> entity = service.findById(id);
        BrandModel model = new BrandModel();
        BeanUtils.copyProperties(entity.getBody(), model);
        return model;
    }

    @PostMapping("")
    public ResponseEntity<BrandsEntity> post(@RequestBody BrandModel model) {
        BrandsEntity entity = new BrandsEntity();
        BeanUtils.copyProperties(model, entity);
        return service.save(entity);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> put(@PathVariable("id") Integer id, @RequestBody BrandModel model) {
        if (id != model.getId()) {
            return ResponseEntity.ok("The id in the path does not exist");
        }
        BrandsEntity entity = new BrandsEntity();
        BeanUtils.copyProperties(model, entity);
        return service.put(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.deleteById(id);
    }
}
