package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProductDetail")
    private int idProductDetail;


    @Column(name = "name",nullable = false)
    private String name;

    @Column(name ="description",nullable = false)
    private String description;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idProduct")
    private Product product;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idColor")
    private Color color;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idBrand")
    private Brand brand;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idState")
    private State state;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idSize")
    private Size size;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idCountry")
    private Country country;

}
