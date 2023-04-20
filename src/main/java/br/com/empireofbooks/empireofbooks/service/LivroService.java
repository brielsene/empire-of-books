package br.com.empireofbooks.empireofbooks.service;

import br.com.empireofbooks.empireofbooks.livro.Livro;
import br.com.empireofbooks.empireofbooks.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public void cadastra(String nome, String autor){
        Livro livro = new Livro().builder().nome(nome).autor(autor).build();
        livroRepository.save(livro);

    }
}
