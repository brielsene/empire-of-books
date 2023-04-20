package br.com.empireofbooks.empireofbooks.service;

import br.com.empireofbooks.empireofbooks.loja.Loja;
import br.com.empireofbooks.empireofbooks.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LojaService {
    @Autowired
    private LojaRepository lojaRepository;

    public Loja lojaById(Long id){
        Optional<Loja> byId = lojaRepository.findById(id);
        if(byId.isPresent()){
            Loja loja = byId.get();
            return loja;
        }else{
            return null;
        }
    }
}
