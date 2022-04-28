package java6.shoptaycam.service.Implement;

import java6.shoptaycam.entity.UserEntity;
import java6.shoptaycam.repository.UserRepository;
import java6.shoptaycam.service.UserService;
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
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<List<UserEntity>> findAll() {
//        return ResponseEntity.ok(userRepository.findAll());
        return ResponseEntity.ok(userRepository.findAll());
    }

    @Override
    public List<UserEntity> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }

    @Override
    public List<UserEntity> findAllById(Iterable<String> strings) {
        return userRepository.findAllById(strings);
    }

    @Override
    public <S extends UserEntity> List<S> saveAll(Iterable<S> entities) {
        return userRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        userRepository.flush();
    }

    @Override
    public <S extends UserEntity> S saveAndFlush(S entity) {
        return userRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends UserEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return userRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<UserEntity> entities) {
        userRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<UserEntity> entities) {
        userRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {
        userRepository.deleteAllByIdInBatch(strings);
    }

    @Override
    public void deleteAllInBatch() {
        userRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public UserEntity getOne(String s) {
        return userRepository.getOne(s);
    }

    @Override
    public UserEntity getById(String s) {
        return userRepository.getById(s);
    }

    @Override
    public <S extends UserEntity> List<S> findAll(Example<S> example) {
        return userRepository.findAll(example);
    }

    @Override
    public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort) {
        return userRepository.findAll(example, sort);
    }

    @Override
    public Page<UserEntity> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public <S extends UserEntity> ResponseEntity<S> save(S entity) {
        if (userRepository.existsById(entity.getUsername())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(userRepository.save(entity));
    }

    public <S extends UserEntity> ResponseEntity<S> put(S entity) {
        if (!userRepository.existsById(entity.getUsername())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userRepository.save(entity));
    }

    @Override
    public ResponseEntity<UserEntity> findById(String s) {
        if (!userRepository.existsById(s)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userRepository.findById(s).get());
    }


    @Override
    public boolean existsById(String s) {
        return userRepository.existsById(s);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(String s) {
        Optional<UserEntity> opt = userRepository.findById(s);
        if (opt.isPresent()) {
            userRepository.deleteById(s);
        } else {
            ResponseEntity.notFound().build();
        }
    }

    @Override
    public void delete(UserEntity entity) {
        userRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        userRepository.deleteAllById(strings);
    }

    @Override
    public void deleteAll(Iterable<? extends UserEntity> entities) {
        userRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    public <S extends UserEntity> Optional<S> findOne(Example<S> example) {
        return userRepository.findOne(example);
    }

    @Override
    public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return userRepository.findAll(example, pageable);
    }

    @Override
    public <S extends UserEntity> long count(Example<S> example) {
        return userRepository.count(example);
    }

    @Override
    public <S extends UserEntity> boolean exists(Example<S> example) {
        return userRepository.exists(example);
    }

    @Override
    public <S extends UserEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return userRepository.findBy(example, queryFunction);
    }
}
