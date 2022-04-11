package java6.shoptaycam.service;

import java6.shoptaycam.entity.UserEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface UserService {
    ResponseEntity<List<UserEntity>> findAll();

    List<UserEntity> findAll(Sort sort);

    List<UserEntity> findAllById(Iterable<String> strings);

    <S extends UserEntity> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends UserEntity> S saveAndFlush(S entity);

    <S extends UserEntity> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<UserEntity> entities);

    void deleteAllInBatch(Iterable<UserEntity> entities);

    void deleteAllByIdInBatch(Iterable<String> strings);

    void deleteAllInBatch();

    @Deprecated
    UserEntity getOne(String s);

    UserEntity getById(String s);

    <S extends UserEntity> List<S> findAll(Example<S> example);

    <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort);

    Page<UserEntity> findAll(Pageable pageable);

    <S extends UserEntity> ResponseEntity<S> save(S entity);

    <S extends UserEntity> ResponseEntity<S> put(S entity);

    ResponseEntity<UserEntity> findById(String s);

    boolean existsById(String s);

    long count();

    void deleteById(String s);

    void delete(UserEntity entity);

    void deleteAllById(Iterable<? extends String> strings);

    void deleteAll(Iterable<? extends UserEntity> entities);

    void deleteAll();

    <S extends UserEntity> Optional<S> findOne(Example<S> example);

    <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends UserEntity> long count(Example<S> example);

    <S extends UserEntity> boolean exists(Example<S> example);

    <S extends UserEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
