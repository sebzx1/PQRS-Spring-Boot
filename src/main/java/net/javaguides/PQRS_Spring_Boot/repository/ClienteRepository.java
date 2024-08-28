package net.javaguides.PQRS_Spring_Boot.repository;

import net.javaguides.PQRS_Spring_Boot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//gestiona cómo una aplicación se comunica con bases de datos
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByDocumento(String documento);
}
