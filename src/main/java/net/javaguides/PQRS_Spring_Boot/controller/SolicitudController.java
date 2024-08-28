package net.javaguides.PQRS_Spring_Boot.controller;

import net.javaguides.PQRS_Spring_Boot.model.Solicitud;
import net.javaguides.PQRS_Spring_Boot.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//responsable de manejar las solicitudes HTTP entrantes y enviar respuestas
@Controller
public class SolicitudController {
    // inyecta automáticamente dependencias en los componentes de una aplicación
    @Autowired
    private SolicitudService solicitudService;

    //manejar solicitudes HTTP GET en aplicaciones web
    @GetMapping("/busqueda")
    public String mostrarFormularioSolicitud(Model model) {
        model.addAttribute("busqueda", new Solicitud());
        return "formulario";
    }

    //manejar las solicitudes HTTP POST
    @PostMapping("/busqueda")
    public String procesarFormularioSolicitud(Solicitud solicitud, Model model) {
        solicitudService.saveSolicitud(solicitud);
        model.addAttribute("mensaje", "Solicitud registrada con éxito!");
        return "index";
    }
}