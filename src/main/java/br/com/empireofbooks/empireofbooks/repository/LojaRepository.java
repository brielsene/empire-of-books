package br.com.empireofbooks.empireofbooks.repository;

import br.com.empireofbooks.empireofbooks.loja.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaRepository extends JpaRepository<Loja, Long> {
}
