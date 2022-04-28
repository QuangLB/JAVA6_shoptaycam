package java6.shoptaycam.service;

import java6.shoptaycam.entity.BrandsEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface BrandService {
    ResponseEntity<List<BrandsEntity>> findAll();

    <S extends BrandsEntity> ResponseEntity<S> save(S entity);

    <S extends BrandsEntity> ResponseEntity<S> put(S entity);

    ResponseEntity<BrandsEntity> findById(Integer integer);

    void deleteById(Integer integer);
}
