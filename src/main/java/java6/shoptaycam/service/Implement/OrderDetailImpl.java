package java6.shoptaycam.service.Implement;

import java6.shoptaycam.entity.OrderdetailsEntity;
import java6.shoptaycam.repository.OrderDetailRepository;
import java6.shoptaycam.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailImpl implements OrderDetailService {
    @Autowired
    OrderDetailRepository repository;

    @Override
    public List<OrderdetailsEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public <S extends OrderdetailsEntity> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<OrderdetailsEntity> findById(Integer integer) {
        return repository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) {
        repository.deleteById(integer);
    }
}
