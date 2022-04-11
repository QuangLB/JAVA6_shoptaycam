package java6.shoptaycam.service;

import java6.shoptaycam.entity.OrdersEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface OrderService {
    ResponseEntity<List<OrdersEntity>> findAll();

    List<OrdersEntity> findAll(Sort sort);

    List<OrdersEntity> findAllById(Iterable<Integer> integers);

    <S extends OrdersEntity> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends OrdersEntity> S saveAndFlush(S entity);

    <S extends OrdersEntity> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<OrdersEntity> entities);

    void deleteAllInBatch(Iterable<OrdersEntity> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    OrdersEntity getOne(Integer integer);

    OrdersEntity getById(Integer integer);

    <S extends OrdersEntity> List<S> findAll(Example<S> example);

    <S extends OrdersEntity> List<S> findAll(Example<S> example, Sort sort);

    Page<OrdersEntity> findAll(Pageable pageable);

    <S extends OrdersEntity> ResponseEntity<S> save(S entity);

    <S extends OrdersEntity> ResponseEntity<S> put(S entity);

    ResponseEntity<OrdersEntity> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(OrdersEntity entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends OrdersEntity> entities);

    void deleteAll();

    <S extends OrdersEntity> Optional<S> findOne(Example<S> example);

    <S extends OrdersEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends OrdersEntity> long count(Example<S> example);

    <S extends OrdersEntity> boolean exists(Example<S> example);

    <S extends OrdersEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
