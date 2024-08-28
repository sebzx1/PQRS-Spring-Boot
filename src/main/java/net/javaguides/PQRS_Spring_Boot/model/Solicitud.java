package net.javaguides.PQRS_Spring_Boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//se aplica el lombok para los getter y setters
@Setter
@Getter
//marca la clase como entidad JPA
@Entity
public class Solicitud {
    @Id
    // especifica cómo se generan los valores de clave principal de una entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoSolicitud;
    private String descripcion;
    private Long clienteId;

}