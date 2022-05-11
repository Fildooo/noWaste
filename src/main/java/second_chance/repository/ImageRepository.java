package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import second_chance.modele.Image;

public interface ImageRepository extends CrudRepository<Image, Integer> {
    Iterable<Image> findByProduct_IdProduct(int idProduct);


}