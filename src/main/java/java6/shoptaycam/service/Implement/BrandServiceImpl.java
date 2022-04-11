package java6.shoptaycam.service.Implement;

import java6.shoptaycam.entity.BrandsEntity;
import java6.shoptaycam.repository.BrandRepository;
import java6.shoptaycam.service.BrandService;
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
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository categoryRepository;

    @Override
    public ResponseEntity<List<BrandsEntity>> findAll() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    @Override
    public List<BrandsEntity> findAll(Sort sort) {
        return categoryRepository.findAll(sort);
    }

    @Override
    public List<BrandsEntity> findAllById(Iterable<Integer> integers) {
        return categoryRepository.findAllById(integers);
    }

    @Override
    public <S extends BrandsEntity> List<S> saveAll(Iterable<S> entities) {
        return categoryRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        categoryRepository.flush();
    }

    @Override
    public <S extends BrandsEntity> S saveAndFlush(S entity) {
        return categoryRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends BrandsEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return categoryRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<BrandsEntity> entities) {
        categoryRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<BrandsEntity> entities) {
        categoryRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        categoryRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        categoryRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public BrandsEntity getOne(Integer integer) {
        return categoryRepository.getOne(integer);
    }

    @Override
    public BrandsEntity getById(Integer integer) {
        return categoryRepository.getById(integer);
    }

    @Override
    public <S extends BrandsEntity> List<S> findAll(Example<S> example) {
        return categoryRepository.findAll(example);
    }

    @Override
    public <S extends BrandsEntity> List<S> findAll(Example<S> example, Sort sort) {
        return categoryRepository.findAll(example, sort);
    }

    @Override
    public Page<BrandsEntity> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
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
    public boolean existsById(Integer integer) {
        return categoryRepository.existsById(integer);
    }

    @Override
    public long count() {
        return categoryRepository.count();
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

    @Override
    public void delete(BrandsEntity entity) {
        categoryRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        categoryRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends BrandsEntity> entities) {
        categoryRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    @Override
    public <S extends BrandsEntity> Optional<S> findOne(Example<S> example) {
        return categoryRepository.findOne(example);
    }

    @Override
    public <S extends BrandsEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return categoryRepository.findAll(example, pageable);
    }

    @Override
    public <S extends BrandsEntity> long count(Example<S> example) {
        return categoryRepository.count(example);
    }

    @Override
    public <S extends BrandsEntity> boolean exists(Example<S> example) {
        return categoryRepository.exists(example);
    }

    @Override
    public <S extends BrandsEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return categoryRepository.findBy(example, queryFunction);
    }
}
