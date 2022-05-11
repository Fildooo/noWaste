package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import second_chance.modele.State;

import java.util.Optional;

public interface StateRepository extends CrudRepository<State, Integer> {
    Optional<State> findByStateProduct(String stateProduct);


}