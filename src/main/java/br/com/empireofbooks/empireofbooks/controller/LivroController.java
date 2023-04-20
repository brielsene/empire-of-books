package br.com.empireofbooks.empireofbooks.controller;

import br.com.empireofbooks.empireofbooks.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping("/livro")
    public String home(){
        return "livro";
    }

    @PostMapping("/livro")
    public String cadastra(@RequestParam("nome") String nome, @RequestParam("autor") String autor){
        livroService.cadastra(nome, autor);
        return "redirect:/livroCadastrado?livroNome=" +nome;

    }

    @GetMapping("/livroCadastrado")
    public String livroCadastrado() {
        return "livroCadastrado";
    }
}
