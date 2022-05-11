package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategorie")
    private int idCategory;

    @Column(name = "nomCategorie",nullable = false,unique = true)
    private String name;

    @ManyToMany(
            mappedBy = "categories",
            cascade = CascadeType.ALL
    )
    private List<Product> products = new ArrayList<>();


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idCountry")
    private Country country;


}
