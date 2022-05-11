package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCountry")
    private int idCountry;

    @Column(name = "name",nullable = false,unique = true)
    private String name;

    @Column(name = "language",nullable = false,unique = true)
    private String language;

    @Column(name = "abbreviation",nullable = false,unique = true)
    private String abbreviation;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idProductDetail")
    private List<ProductDetail> productDetails =new ArrayList<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idCategory")
    private List<Category> categories =new ArrayList<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idState")
    private List<State> state =new ArrayList<>();




    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idSize")
    private List<Size> sizes =new ArrayList<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idColor")
    private List<Color> colors =new ArrayList<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idTVA")
    private List<TVA> tvaList =new ArrayList<>();
}
