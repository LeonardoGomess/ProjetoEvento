package fiap.com.br.projetoEvento.repository;

import fiap.com.br.projetoEvento.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento , Long> {
}
