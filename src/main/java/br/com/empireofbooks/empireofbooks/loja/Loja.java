package br.com.empireofbooks.empireofbooks.loja;

import br.com.empireofbooks.empireofbooks.livro.Livro;
import br.com.empireofbooks.empireofbooks.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table(name = "loja")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_unidade")
    private String nomeUnidade;
    @Embedded
    private Endereco endereco;
    @OneToMany(mappedBy = "loja", cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<Livro>livros;
}
