package noWaste.modele;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "commercants")
public class Commercant {

    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "localisation", nullable = false, length = 20)
    private String localisation;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commercant")
    private List<Panier> paniers;
}
