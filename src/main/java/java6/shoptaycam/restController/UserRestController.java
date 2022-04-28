package java6.shoptaycam.restController;

import java6.shoptaycam.entity.UserEntity;
import java6.shoptaycam.repository.UserRepository;
import java6.shoptaycam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")
public class UserRestController {
    @Autowired
    UserService service;

    @Autowired
    UserRepository repo;

    @GetMapping("")
    public ResponseEntity<List<UserEntity>> getAll() {
        return service.findAll();
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserEntity> getByID(@PathVariable("username") String username) {
        return service.findById(username);
    }

    @PostMapping("")
    public ResponseEntity<UserEntity> post(@RequestBody UserEntity userEntity) {
        return service.save(userEntity);
    }

    @PutMapping("/{username}")
    public ResponseEntity<?> put(@PathVariable("username") String username, @RequestBody UserEntity userEntity) {
        if (!username.equals(userEntity.getUsername())) {
            return ResponseEntity.ok("The id in the path does not exist");
        }
        return service.put(userEntity);
    }

    @DeleteMapping("/{username}")
    public void delete(@PathVariable("username") String username) {
        service.deleteById(username);
    }

}
