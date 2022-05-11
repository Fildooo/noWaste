package second_chance.modele;

import javax.persistence.*;

@Entity
public class TVA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTVA")
    private int idTVA;

    @Column(name = "pourcentage", nullable = false)
    private double pourcentage;


    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="idCountry")
    private Country country;
}
