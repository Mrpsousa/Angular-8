  
package roger.com.vendaLoja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roger.com.vendaLoja.entity.Pedido;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RestController
@RequestMapping("/pedido")
public class PedidoController extends BaseController<Pedido, BaseService<Pedido>> {

}