package second_chance.repository;


import org.springframework.data.repository.CrudRepository;
import second_chance.modele.Color;

import java.util.Optional;

public interface ColorRepository extends CrudRepository<Color, Integer> {
    Optional<Color> findByName(String name);




}