package java6.shoptaycam.repository;

import java6.shoptaycam.entity.OrderdetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderdetailsEntity, Integer> {
}
