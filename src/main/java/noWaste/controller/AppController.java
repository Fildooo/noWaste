package noWaste.controller;

import noWaste.modele.Panier;
import noWaste.modele.User;
import noWaste.repository.PanierRepository;
import noWaste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class AppController {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PanierRepository panierRepo;


    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/espace_co")
    public String espaceCo(Model model) {
        List<Panier> listPaniers = panierRepo.findAll();
        model.addAttribute("listPaniers", listPaniers);
        return "espace_co";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());

        return "login";
    }

    @GetMapping("/addpanier")
    public String showAddpanierForm(Model model) {
        model.addAttribute("panier", new Panier());
        return "addpanier";
    }

    @PostMapping("/process_panier")
    public String processPanier(Panier panier) {

        panierRepo.save(panier);

        return "panier_success";
    }

    @RequestMapping("/process_reservation")
    public String processReservation(User user, Panier panier) {
        panier.setUser(user);
        panierRepo.save(panier);

        return "reservation_success";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }

    @GetMapping("/home")
    public String listPaniers(Model model) {
        List<Panier> listPaniers = panierRepo.findAll();
        model.addAttribute("listPaniers", listPaniers);

        return "home";
    }


}
