package co.com.microservicio.inscripciones.repository;

import co.com.microservicio.inscripciones.models.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, String> {

    Inscription findInscriptionByEventId(Integer eventId);
}
