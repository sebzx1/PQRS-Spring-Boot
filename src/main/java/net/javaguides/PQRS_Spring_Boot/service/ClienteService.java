package net.javaguides.PQRS_Spring_Boot.service;

import net.javaguides.PQRS_Spring_Boot.model.Cliente;
import net.javaguides.PQRS_Spring_Boot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//se realizar la lógica empresarial y encapsular
// la funcionalidad de la aplicación


//anota las clases en la capa de servicio de una aplicación web.
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente getClienteByDocumento(String documento) {
        return clienteRepository.findByDocumento(documento);
    }

    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}