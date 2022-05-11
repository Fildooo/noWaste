package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idState")
    private int idState;

    @Column(name = "stateProduct", nullable = false)
    private String stateProduct;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "idProductDetail")
    private List<ProductDetail> productsDetail =new ArrayList<>();


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idCountry")
    private Country country;

}
