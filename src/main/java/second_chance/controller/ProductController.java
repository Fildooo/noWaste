package second_chance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import second_chance.modele.Product;
import second_chance.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product")
    public String product(Model model){

        Iterable<Product> products = productRepository.findAll();
        System.out.println(products);

        model.addAttribute("product", products);
        return "product";
    }
}
