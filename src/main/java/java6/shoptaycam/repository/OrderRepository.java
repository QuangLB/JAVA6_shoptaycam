package java6.shoptaycam.repository;

import java6.shoptaycam.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrdersEntity, Integer> {
}
