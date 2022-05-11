package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import second_chance.modele.Size;

import java.util.Optional;

public interface SizeRepository extends CrudRepository<Size, Integer> {
    Optional<Size> findByValueSize(String valueSize);


}