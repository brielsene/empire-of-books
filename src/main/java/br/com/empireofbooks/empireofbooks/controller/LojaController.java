package br.com.empireofbooks.empireofbooks.controller;

import br.com.empireofbooks.empireofbooks.loja.Loja;
import br.com.empireofbooks.empireofbooks.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @GetMapping("/livraria")
    public String home(){

        return"livraria";
    }

    @GetMapping("loja/{id}")
    public String lojaById(@PathVariable("id") Long id, Model model) {
        Loja loja = lojaService.lojaById(id);
        model.addAttribute("loja", loja); // Adiciona o objeto loja ao modelo do Spring
        return "livraria"; // Retorna o nome da view (HTML)
    }
}
