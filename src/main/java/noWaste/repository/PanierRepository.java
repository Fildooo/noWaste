package noWaste.repository;

import noWaste.modele.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PanierRepository extends JpaRepository<Panier, Long> {

    @Query("SELECT u FROM Panier u WHERE u.name = ?1")
    public Panier findByName(String name);

}
