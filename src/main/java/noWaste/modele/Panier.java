package noWaste.modele;

import javax.persistence.*;

@Entity
@Table(name = "paniers")
public class Panier{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "stock", nullable = false, length = 20)
    private int stock;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

  //  @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "commercant_id")
   // private Commercant commercant;
    // getters and setters are not shown


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
/**
    public Commercant getCommercant() {
        return commercant;
    }

    public void setCommercant(Commercant commercant) {
        this.commercant = commercant;
    }
 **/
}