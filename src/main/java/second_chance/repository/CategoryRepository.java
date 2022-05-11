package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import second_chance.modele.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    Optional<Category> findByName(String name);


}