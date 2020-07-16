  
package roger.com.vendaLoja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import roger.com.vendaLoja.dto.PedidoDTO;
import roger.com.vendaLoja.dto.PedidoDetalharDTO;
import roger.com.vendaLoja.entity.Pedido;
import roger.com.vendaLoja.service.PedidoDetalharService;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RestController
@RequestMapping("/pedido")
public class PedidoController extends BaseController<Pedido, PedidoDTO, BaseService<Pedido, PedidoDTO>> {

	@Autowired
	private PedidoDetalharService service;
	
	@GetMapping("/{id}/detail")
	public ResponseEntity<PedidoDetalharDTO> detalharPedido(@PathVariable Long id) {
		try {
			return service.detalhar(id);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Entity não encontrada");
			
		}
	}
	
}