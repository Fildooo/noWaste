package second_chance.modele;

import javax.persistence.*;


@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idImage")
    private int idImage;

    @Column(name = "url",nullable = false,unique = true)
    private String url;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idProduct")
    private Product product;


}
