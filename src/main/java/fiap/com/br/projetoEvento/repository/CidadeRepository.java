package fiap.com.br.projetoEvento.repository;

import fiap.com.br.projetoEvento.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade , Long> {
}
