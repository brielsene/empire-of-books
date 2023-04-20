package br.com.empireofbooks.empireofbooks.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Endereco {
    private String estado;
    private String cidade;
    private String rua;
    private String zipcode;
}
