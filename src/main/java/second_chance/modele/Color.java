package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idColor")
    private int idColor;

    @Column(name = "name",nullable = false,unique = true)
    private String name;

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
