package java6.shoptaycam.service.Implement;

import java6.shoptaycam.entity.ProductEntity;
import java6.shoptaycam.repository.ProductRepository;
import java6.shoptaycam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public ResponseEntity<List<ProductEntity>> findAll() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @Override
    public List<ProductEntity> findAll(Sort sort) {
        return productRepository.findAll(sort);
    }

    @Override
    public List<ProductEntity> findAllById(Iterable<Integer> integers) {
        return productRepository.findAllById(integers);
    }

    @Override
    public <S extends ProductEntity> List<S> saveAll(Iterable<S> entities) {
        return productRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        productRepository.flush();
    }

    @Override
    public <S extends ProductEntity> S saveAndFlush(S entity) {
        return productRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends ProductEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return productRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<ProductEntity> entities) {
        productRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<ProductEntity> entities) {
        productRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        productRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        productRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public ProductEntity getOne(Integer integer) {
        return productRepository.getOne(integer);
    }

    @Override
    public ProductEntity getById(Integer integer) {
        return productRepository.getById(integer);
    }

    @Override
    public <S extends ProductEntity> List<S> findAll(Example<S> example) {
        return productRepository.findAll(example);
    }

    @Override
    public <S extends ProductEntity> List<S> findAll(Example<S> example, Sort sort) {
        return productRepository.findAll(example, sort);
    }

    @Override
    public Page<ProductEntity> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public <S extends ProductEntity> ResponseEntity<S> save(S entity) {
        if (productRepository.existsById(entity.getId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productRepository.save(entity));
    }

    @Override
    public <S extends ProductEntity> ResponseEntity<S> put(S entity) {
        if (!productRepository.existsById(entity.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productRepository.save(entity));
    }

    @Override
    public ResponseEntity<ProductEntity> findById(Integer integer) {
        if (!productRepository.existsById(integer)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productRepository.findById(integer).get());

    }

    @Override
    public boolean existsById(Integer integer) {
        return productRepository.existsById(integer);
    }

    @Override
    public long count() {
        return productRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        Optional<ProductEntity> opt = productRepository.findById(integer);
        if (opt.isPresent()){
            productRepository.deleteById(integer);
        }
        else {
            ResponseEntity.notFound().build();
        }
    }

    @Override
    public void delete(ProductEntity entity) {
        productRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        productRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends ProductEntity> entities) {
        productRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public <S extends ProductEntity> Optional<S> findOne(Example<S> example) {
        return productRepository.findOne(example);
    }

    @Override
    public <S extends ProductEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return productRepository.findAll(example, pageable);
    }

    @Override
    public <S extends ProductEntity> long count(Example<S> example) {
        return productRepository.count(example);
    }

    @Override
    public <S extends ProductEntity> boolean exists(Example<S> example) {
        return productRepository.exists(example);
    }

    @Override
    public <S extends ProductEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return productRepository.findBy(example, queryFunction);
    }
}
