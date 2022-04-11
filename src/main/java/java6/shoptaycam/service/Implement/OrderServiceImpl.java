package java6.shoptaycam.service.Implement;

import java6.shoptaycam.entity.OrdersEntity;
import java6.shoptaycam.repository.OrderRepository;
import java6.shoptaycam.service.OrderService;
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
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public ResponseEntity<List<OrdersEntity>> findAll() {
        return ResponseEntity.ok(orderRepository.findAll());
    }

    @Override
    public List<OrdersEntity> findAll(Sort sort) {
        return orderRepository.findAll(sort);
    }

    @Override
    public List<OrdersEntity> findAllById(Iterable<Integer> integers) {
        return orderRepository.findAllById(integers);
    }

    @Override
    public <S extends OrdersEntity> List<S> saveAll(Iterable<S> entities) {
        return orderRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        orderRepository.flush();
    }

    @Override
    public <S extends OrdersEntity> S saveAndFlush(S entity) {
        return orderRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends OrdersEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return orderRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<OrdersEntity> entities) {
        orderRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<OrdersEntity> entities) {
        orderRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        orderRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        orderRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public OrdersEntity getOne(Integer integer) {
        return orderRepository.getOne(integer);
    }

    @Override
    public OrdersEntity getById(Integer integer) {
        return orderRepository.getById(integer);
    }

    @Override
    public <S extends OrdersEntity> List<S> findAll(Example<S> example) {
        return orderRepository.findAll(example);
    }

    @Override
    public <S extends OrdersEntity> List<S> findAll(Example<S> example, Sort sort) {
        return orderRepository.findAll(example, sort);
    }

    @Override
    public Page<OrdersEntity> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    @Override
    public <S extends OrdersEntity> ResponseEntity<S> save(S entity) {
        if (orderRepository.existsById(entity.getId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(orderRepository.save(entity));
    }

    @Override
    public <S extends OrdersEntity> ResponseEntity<S> put(S entity) {
        if (!orderRepository.existsById(entity.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(orderRepository.save(entity));
    }

    @Override
    public ResponseEntity<OrdersEntity> findById(Integer integer) {
        if (!orderRepository.existsById(integer)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(orderRepository.findById(integer).get());
    }

    @Override
    public boolean existsById(Integer integer) {
        return orderRepository.existsById(integer);
    }

    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        Optional<OrdersEntity> opt = orderRepository.findById(integer);
        if (opt.isPresent()) {
            orderRepository.deleteById(integer);
        } else {
            ResponseEntity.notFound().build();
        }
    }

    @Override
    public void delete(OrdersEntity entity) {
        orderRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        orderRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends OrdersEntity> entities) {
        orderRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        orderRepository.deleteAll();
    }

    @Override
    public <S extends OrdersEntity> Optional<S> findOne(Example<S> example) {
        return orderRepository.findOne(example);
    }

    @Override
    public <S extends OrdersEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return orderRepository.findAll(example, pageable);
    }

    @Override
    public <S extends OrdersEntity> long count(Example<S> example) {
        return orderRepository.count(example);
    }

    @Override
    public <S extends OrdersEntity> boolean exists(Example<S> example) {
        return orderRepository.exists(example);
    }

    @Override
    public <S extends OrdersEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return orderRepository.findBy(example, queryFunction);
    }
}
