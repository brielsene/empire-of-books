package br.com.empireofbooks.empireofbooks.livro;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import br.com.empireofbooks.empireofbooks.loja.Loja;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "livro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String autor;
    private String editora;
    private BigDecimal preco;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_loja")
    @JsonBackReference
    private Loja loja;

}
