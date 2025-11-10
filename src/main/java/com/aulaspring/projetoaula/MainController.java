package com.aulaspring.projetoaula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/contato")
    public String contato(){
        return "contato";
    } 

    @GetMapping("/vendedores")
    public String vendedores(){
        return "vendedores";
    }

    @GetMapping("/catalogo")
    public String catalogo(){
        return "catalogo";
    }
}
