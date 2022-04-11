package java6.shoptaycam.service;

import java6.shoptaycam.entity.ProductEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProductService {
    ResponseEntity<List<ProductEntity>> findAll();

    List<ProductEntity> findAll(Sort sort);

    List<ProductEntity> findAllById(Iterable<Integer> integers);

    <S extends ProductEntity> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends ProductEntity> S saveAndFlush(S entity);

    <S extends ProductEntity> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<ProductEntity> entities);

    void deleteAllInBatch(Iterable<ProductEntity> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    ProductEntity getOne(Integer integer);

    ProductEntity getById(Integer integer);

    <S extends ProductEntity> List<S> findAll(Example<S> example);

    <S extends ProductEntity> List<S> findAll(Example<S> example, Sort sort);

    Page<ProductEntity> findAll(Pageable pageable);

    <S extends ProductEntity> ResponseEntity<S> save(S entity);

    <S extends ProductEntity> ResponseEntity<S> put(S entity);

    ResponseEntity<ProductEntity> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(ProductEntity entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends ProductEntity> entities);

    void deleteAll();

    <S extends ProductEntity> Optional<S> findOne(Example<S> example);

    <S extends ProductEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends ProductEntity> long count(Example<S> example);

    <S extends ProductEntity> boolean exists(Example<S> example);

    <S extends ProductEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
