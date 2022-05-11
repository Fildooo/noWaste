package second_chance.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import second_chance.modele.Brand;

import java.util.Optional;


@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {
    Optional<Brand> findByName(String name);


}