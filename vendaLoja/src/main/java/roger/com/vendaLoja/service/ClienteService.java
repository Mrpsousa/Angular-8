package roger.com.vendaLoja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roger.com.vendaLoja.models.Cliente;
import roger.com.vendaLoja.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

		
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		repository.save(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		return;
	}
}
