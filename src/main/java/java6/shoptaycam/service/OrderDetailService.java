package java6.shoptaycam.service;

import java6.shoptaycam.entity.OrderdetailsEntity;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    List<OrderdetailsEntity> findAll();

    <S extends OrderdetailsEntity> S save(S entity);

    Optional<OrderdetailsEntity> findById(Integer integer);

    void deleteById(Integer integer);
}
