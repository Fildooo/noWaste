package second_chance.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private int idProduct;


    @Column(name = "reference", nullable = false, unique = true)
    private String reference;


    @Column(name = "priceHT", nullable = false)
    private double priceHT;

    @Column(name = "priceTTC", nullable = false)
    private double priceTTC;

    @Column(name = "isVerified", nullable = false)
    private boolean isVerified;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "produit_has_category",
            joinColumns = @JoinColumn(name = "idProduct"),
            inverseJoinColumns = @JoinColumn(name = "idCategory")
    )
    private List<Category> categories = new ArrayList<>();



    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idProductDetail")
    private List<ProductDetail> productsDetail =new ArrayList<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "idProduct")
    private List<Image> images =new ArrayList<>();


    public Product() {
    }

    public Product(int idProduct, String reference, double priceHT, double priceTTC, boolean isVerified, List<Category> categories, List<ProductDetail> productsDetail, List<Image> images) {
        this.idProduct = idProduct;
        this.reference = reference;
        this.priceHT = priceHT;
        this.priceTTC = priceTTC;
        this.isVerified = isVerified;
        this.categories = categories;
        this.productsDetail = productsDetail;
        this.images = images;
    }


    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPriceHT() {
        return priceHT;
    }

    public void setPriceHT(double priceHT) {
        this.priceHT = priceHT;
    }

    public double getPriceTTC() {
        return priceTTC;
    }

    public void setPriceTTC(double priceTTC) {
        this.priceTTC = priceTTC;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<ProductDetail> getProductsDetail() {
        return productsDetail;
    }

    public void setProductsDetail(List<ProductDetail> productsDetail) {
        this.productsDetail = productsDetail;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }


    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", reference='" + reference + '\'' +
                ", priceHT=" + priceHT +
                ", priceTTC=" + priceTTC +
                ", isVerified=" + isVerified +
                ", categories=" + categories +
                ", productsDetail=" + productsDetail +
                ", images=" + images +
                '}';
    }
}
