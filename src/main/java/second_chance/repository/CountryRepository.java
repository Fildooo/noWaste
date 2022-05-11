package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import second_chance.modele.Country;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Integer> {
    Optional<Country> findByName(String name);

    Optional<Country> findByLanguage(String language);

    Optional<Country> findByAbbreviation(String abbreviation);





}