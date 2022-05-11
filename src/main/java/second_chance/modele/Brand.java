package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBrand")
    private int idBrand;

    @Column(name = "name",nullable = false)
    private String name;





    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "idProductDetail")
    private List<ProductDetail> productsDetail =new ArrayList<>();








}
