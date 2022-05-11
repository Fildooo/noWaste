package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import second_chance.modele.ProductDetail;

public interface ProductDetailRepository extends CrudRepository<ProductDetail, Integer> {
}