package java6.shoptaycam.repository;

import java6.shoptaycam.entity.BrandsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandsEntity, Integer> {
}
