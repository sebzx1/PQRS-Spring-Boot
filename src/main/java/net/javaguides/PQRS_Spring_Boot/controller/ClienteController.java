package net.javaguides.PQRS_Spring_Boot.controller;

import net.javaguides.PQRS_Spring_Boot.model.Cliente;
import net.javaguides.PQRS_Spring_Boot.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//responsable de manejar las solicitudes HTTP entrantes y enviar respuestas
@Controller
public class ClienteController {
    // inyecta automáticamente dependencias en los componentes de una aplicación
    @Autowired
    private ClienteService clienteService;

    //manejar solicitudes HTTP GET en aplicaciones web
    @GetMapping("/formulario")
    public String mostrarFormularioCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "formulario";
    }

    //manejar las solicitudes HTTP POST
    @PostMapping("/formulario")
    public String procesarFormularioCliente(Cliente cliente, Model model) {
        clienteService.saveCliente(cliente);
        model.addAttribute("mensaje", "Cliente registrado con éxito!");
        return "index";
    }
}
