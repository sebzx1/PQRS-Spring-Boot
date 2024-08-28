package net.javaguides.PQRS_Spring_Boot.service;

import net.javaguides.PQRS_Spring_Boot.model.Solicitud;
import net.javaguides.PQRS_Spring_Boot.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//se realizar la lógica empresarial y encapsular
// la funcionalidad de la aplicación


//anota las clases en la capa de servicio de una aplicación web.
@Service
public class SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    public void saveSolicitud(Solicitud solicitud) {
        solicitudRepository.save(solicitud);
    }
}
