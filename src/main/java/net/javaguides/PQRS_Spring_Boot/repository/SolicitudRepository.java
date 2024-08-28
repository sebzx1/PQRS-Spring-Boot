package net.javaguides.PQRS_Spring_Boot.repository;

import net.javaguides.PQRS_Spring_Boot.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//gestiona cómo una aplicación se comunica con bases de datos
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    Optional<Solicitud> findById(Long id);
}
