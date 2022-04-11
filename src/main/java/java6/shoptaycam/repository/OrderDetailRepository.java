package java6.shoptaycam.repository;

import java6.shoptaycam.entity.OrderdetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderdetailsEntity, Integer> {
}
