package java6.shoptaycam.service;

import java6.shoptaycam.entity.BrandsEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface BrandService {
    ResponseEntity<List<BrandsEntity>> findAll();

    List<BrandsEntity> findAll(Sort sort);

    List<BrandsEntity> findAllById(Iterable<Integer> integers);

    <S extends BrandsEntity> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends BrandsEntity> S saveAndFlush(S entity);

    <S extends BrandsEntity> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<BrandsEntity> entities);

    void deleteAllInBatch(Iterable<BrandsEntity> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    BrandsEntity getOne(Integer integer);

    BrandsEntity getById(Integer integer);

    <S extends BrandsEntity> List<S> findAll(Example<S> example);

    <S extends BrandsEntity> List<S> findAll(Example<S> example, Sort sort);

    Page<BrandsEntity> findAll(Pageable pageable);

    <S extends BrandsEntity> ResponseEntity<S> save(S entity);

    <S extends BrandsEntity> ResponseEntity<S> put(S entity);

    ResponseEntity<BrandsEntity> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(BrandsEntity entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends BrandsEntity> entities);

    void deleteAll();

    <S extends BrandsEntity> Optional<S> findOne(Example<S> example);

    <S extends BrandsEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends BrandsEntity> long count(Example<S> example);

    <S extends BrandsEntity> boolean exists(Example<S> example);

    <S extends BrandsEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
