package java6.shoptaycam.controller;

import java6.shoptaycam.entity.OrdersEntity;
import java6.shoptaycam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/order")
public class OrderRestController {
    @Autowired
    private OrderService service;

    @GetMapping("")
    public ResponseEntity<List<OrdersEntity>> getAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<OrdersEntity> getById(@PathVariable("id") Integer id){
        return service.findById(id);
    }
    @PostMapping("")
    public ResponseEntity<OrdersEntity> post(@RequestBody OrdersEntity ordersEntity){
        return service.save(ordersEntity);
    }
    @PutMapping("/{id}")
    public ResponseEntity<OrdersEntity> put(@PathVariable("id") Integer id, @RequestBody OrdersEntity ordersEntity){
        return service.put(ordersEntity);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Integer id){
        service.deleteById(id);
    }
}
