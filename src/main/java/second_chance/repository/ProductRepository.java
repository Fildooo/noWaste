package second_chance.repository;

import org.springframework.data.repository.CrudRepository;
import second_chance.modele.Product;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Optional<Product> findByProductsDetail_IdProductDetail(int idProductDetail);

    Optional<Product> findByProductsDetail_Name(String name);


    Iterable<Product> findByCategories_IdCategory(int idCategory);

    Iterable<Product> findByCategories_Name(String name);


    Iterable<Product> findByProductsDetail_Color_IdColor(int idColor);

    Iterable<Product> findByProductsDetail_Color_Name(String name);



    Iterable<Product> findByProductsDetail_Brand_IdBrand(int idBrand);

    Iterable<Product> findByProductsDetail_Brand_Name(String name);



    Iterable<Product> findByProductsDetail_State_IdState(int idState);

    Iterable<Product> findByProductsDetail_State_StateProduct(String stateProduct);


    Iterable<Product> findByProductsDetail_Size_IdSize(int idSize);

    Iterable<Product> findByProductsDetail_Size_ValueSize(String valueSize);


    Iterable<Product> findByProductsDetail_Country_Name(String name);

    Iterable<Product> findByProductsDetail_Country_Language(String language);

    Iterable<Product> findByProductsDetail_Country_Abbreviation(String abbreviation);


    Iterable<Product> findByPriceHTBetween(double priceHTStart, double priceHTEnd);

    Iterable<Product> findByPriceTTCBetween(double priceTTCStart, double priceTTCEnd);


    Iterable<Product> findByIsVerified(boolean isVerified);

    Iterable<Product> findByIsVerifiedIsNot(boolean isVerified);

}