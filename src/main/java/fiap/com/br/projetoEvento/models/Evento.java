package fiap.com.br.projetoEvento.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"nome","data","url"})

@Entity
@Table(name = "tb_eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 carateres")
    private String nome;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "A data deve ter no mínimo 3 carateres")
    private String data;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "A url deve ter no mínimo 3 carateres")
    private String url;

    @ManyToOne
    @JoinColumn(name = "cidade_id", nullable = false) //PK
    private Cidade cidade;

}
