package java6.shoptaycam.service.Implement;

import java6.shoptaycam.entity.BrandsEntity;
import java6.shoptaycam.repository.BrandRepository;
import java6.shoptaycam.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository categoryRepository;

    @Override
    public ResponseEntity<List<BrandsEntity>> findAll() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }


    @Override
    public <S extends BrandsEntity> ResponseEntity<S> save(S entity) {
        if (categoryRepository.existsById(entity.getId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(categoryRepository.save(entity));
    }

    public <S extends BrandsEntity> ResponseEntity<S> put(S entity) {
        if (!categoryRepository.existsById(entity.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categoryRepository.save(entity));
    }

    @Override
    public ResponseEntity<BrandsEntity> findById(Integer integer) {
        if (!categoryRepository.existsById(integer)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categoryRepository.findById(integer).get());
    }

    @Override
    public void deleteById(Integer integer) {
        Optional<BrandsEntity> opt = categoryRepository.findById(integer);
        if (opt.isPresent()) {
            categoryRepository.deleteById(integer);
        } else {
            ResponseEntity.notFound().build();
        }
    }
}
